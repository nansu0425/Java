//Lab1_자바프로그래밍2_1분반_9월 19일_허준
import java.util.ArrayList;
import java.util.HashMap;

public class ImageProcessor { //Iprocess, FormatConverter, ResolutionChanger을 다룬다
	private IProcessor processor;  
	private HashMap<String, FormatConverter> converters = new HashMap<> (); //extension을 key로 갖고, converter 객체를 value로 갖는 map
	private String filename; 
	private Resolution resolution;
	private ArrayList<ResolutionChanger> changers = new ArrayList<> (); //ResolutionChanger type의 객체를 갖는 arraylist
	
	public ImageProcessor(String filename, int widthPixels, int heightPixels) { //filename과 resolution을 초기화 하는 생성자
		this.filename = filename; 
		this.resolution = new Resolution(widthPixels, heightPixels);
		System.out.println("Filename is " + this.filename + " and Resolution is " + this.resolution); //현재 filename과 resolution 정보를 출력
	}
	
	public void addConverter(FormatConverter converter) { //converters에 FormatConverter 객체를 추가한다
		converters.put(converter.getExtension(), converter);
	}
	
	public void convertTo(String extension) { //filename의 extension를 변경한다
		FormatConverter converter = this.converters.get(extension); //인자로 받은 extension을 key로 갖는 converters의 value 값을 저장
		
		if (converter == null) { //key에 해당하는 value가 없을 경우 변경하지 않음
			System.out.println("Image can't be converted to " + extension);
		} else {
			String filenameWithoutExtension = this.filename.substring(0, this.filename.indexOf(".")); //filename 문자열의 첫 문자부터 "." 문자 전까지의 문자만 저장
			this.filename = filenameWithoutExtension + "." + extension; //filename을 인자로 받은 extension과 filenameWithoutExtension을 합쳐서 다시 만든다
			converter.save(filenameWithoutExtension); //extension이 convert됐다는 것을 출력
		}
	}

	public void setImageProcessor(IProcessor processor) { //processor 값을 설정한다
		this.processor = processor;
	}
	
	public void processImage() { //Iprocessor의 process를 실행
		this.processor.process(this.filename);
	}
	
	public void addChanger(ResolutionChanger changer) { //changers에 ResolutionChanger 객체를 추가
		this.changers.add(changer);
	}	
	
	public void changeTo(Resolution resolution) { //resolution 값을 인자로 들어온 resolution 값으로 바꾼다
		for (ResolutionChanger rc : this.changers) { //rc는 changers의 객체를 순차적으로 가리킨다
			if (rc.equals(resolution)) { //rc의 resolution과 인자로 받는 resolution이 같으면 값을 변경하고 메소드를 탈출한다
				this.resolution = resolution;
				rc.change(this.filename);
				return;
			}
		}
		
		System.out.println("Image can't be changed to " + resolution); //changers에 resolution이 일치하는 객체가 없으면 값을 바꾸지 않는다
	}
}
