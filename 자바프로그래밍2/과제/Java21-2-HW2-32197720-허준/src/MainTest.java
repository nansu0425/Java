//Lab2_자바프로그래밍2_1분반_9월 26일_허준
public class MainTest {
	static IProcessor[] processors = { // processor 배열
			new ImageGrayscale(),
			new ImageBlur(),
			new ImageNegative(),
			new ImageHorizontallyFlip(),
			new ImageVerticallyFlip()
	};
	
	static String[] imageFiles = { // image들의 배열
			"./노르웨이숲.jpg",
			"./샴.jpg",
			"./시베리안포레스트.jpg",
			"./러시안블루.jpg"
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (IProcessor processor : processors) { // image들을 processors에 존재하는 모든 방식으로 process
			ImageProcessor ip = new ImageProcessor(processor);
			ip.process(imageFiles);
		}
	}

}
