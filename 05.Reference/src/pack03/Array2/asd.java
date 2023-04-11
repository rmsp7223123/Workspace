package pack03.Array2;
import java.util.Scanner;
public class asd {
	public static void main(String[] args) {



		while(true) {

			Scanner sc = new Scanner(System.in);

			int count=0;

			

			System.out.println("어느칸에 특정한 값이 숨어있는지 맞추는 게임이 시작되었습니다.");

			System.out.print("난이도를 입력 : ");

			int userNum = Integer.parseInt(sc.nextLine());

			System.out.println("난이도 : "+userNum);

			

			int[]array = new int[userNum];

			array[(int)(Math.random()*array.length)]=1;

			

		while(true) {

			System.out.print("답을 입력하시오(난이도 이하의 숫자를 입력)\n=>");

			int userAnswer= Integer.parseInt(sc.nextLine())-1;

			count+=1;

			

			if(array.length<userAnswer ||array.length>userAnswer) {

				System.out.println("다시 입력");

			}else if(array[userAnswer]==1) {

				System.out.println("정답");

				System.out.println("시도 횟수는 :"+ count +"번 입니다.\n\n\n\n");

				break;

			}else {

				System.out.println("오답\n");

				

			}

		}

		}

		}

	}

