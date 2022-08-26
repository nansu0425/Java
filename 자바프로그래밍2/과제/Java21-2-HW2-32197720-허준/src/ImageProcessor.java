//Lab2_자바프로그래밍2_1분반_9월 26일_허준
import java.awt.image.BufferedImage;

public class ImageProcessor {
	private IProcessor processor = null; //processor 생성
	
	public ImageProcessor(IProcessor processor) { //processor 생성자
		super();
		this.processor = processor;
	}

	public void process(String filename) { //fimename에 해당하는 image를 load하고 process를 거친 후 save
		BufferedImage image = ImageUtil.load(filename);
		BufferedImage oImage = processor.process(image);
		String format = ImageUtil.getExtension(filename);
		String oFile = 
				ImageUtil.getFullpathWithoutExt(filename) +
				processor.name() + "." +
				ImageUtil.getExtension(filename);
		ImageUtil.save(oImage, format, oFile);
	}
	
	public void process(String[] filenames) { //여러 file을 process
		for (String filename : filenames) {
			process(filename);
		}
	}

	public void setProcessor(IProcessor processor) { //processor를 set
		this.processor = processor;
	}
}
