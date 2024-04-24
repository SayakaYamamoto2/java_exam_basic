package enhancement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
		public static void main(String[] args) throws IOException{
			
//			座席を作成→座席の型をseatに指定。要素30。番号は添え字で管理
			boolean[]seat=new boolean[30];
			
//			ループを作る
			for(int i=0; i<30;i++) {
				seat[i]=false;
			}
			
//			15．21はtrue(予約済み)。その他はfalse(空席)
			seat[14]=true;
			seat[20]=true;
			
	//　　　質問を出力。readLineで受付待ちをして、相手に数字を入力してもらう。		
			System.out.println("ようこそジャマイカホールへ！");
			System.out.println("何番の座席を予約しますか？(1～30)");
			
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			String str=reader.readLine();
			int num=Integer.parseInt(str);//numにはint型の数字が入ります。
			
//			相手が数字を入力した後の処理
//	      条件分岐
			if(seat[num-1]) {
				System.out.println("※予約済みの座席です。他の席を選択してください。");
			}else{	
				System.out.println("座席の予約が完了しました。");
//		　　予約したい
				seat[num-1]=true;
				
			}
			System.out.println("ようこそジャマイカホールへ！");
			System.out.println("何番の座席を予約しますか？(1～30)");
			
			BufferedReader reader1=new BufferedReader(new InputStreamReader(System.in));
			String str1=reader1.readLine();
			int num1=Integer.parseInt(str1);//numにはint型の数字が入ります。
			
//			相手が数字を入力した後の処理
//	      条件分岐
			if(seat[num1-1]) {
				System.out.println("※予約済みの座席です。他の席を選択してください。");
			}else{	
				System.out.println("座席の予約が完了しました。");
//		　　予約したい
				seat[num1-1]=true;
				
			}

		}

	}

