//Lab2_자바프로그래밍2_1분반_9월 26일_허준
import java.awt.image.BufferedImage;

public interface IProcessor {
	BufferedImage process(BufferedImage image); // 구현하는 class에 따라 image를 다른 방식으로 process
	
	String name(); // 구현하는 class의 process 처리 종류
}
