package chap99_homework.hw231020.student;

public interface Student {
	//해당 학생의 과목과 점수배열이 있는데
	//과목이랑 점수를 하나씩 저장해주는 메소드
	public void saveInfo(int index, String subject, int score);	
	//학번, 이름, 평균점수 출력하는 메소드
	public void printInfo();
	//점수배열을 이용해서 평균점수를 구해주는 메소드
	public double getAvg();
}
