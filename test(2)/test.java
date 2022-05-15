//학생 n명을 입력했을때ㄱ
//학생 1명마다의 세과목이 출력
//학생1의 국영수가 나와야되니깐 학생밑에 과목이 들어가야되는건가?
//int n -> 학생수 입력 proc에서 입력받은 학생수 선 계산 -> 계산된 학생수만큼 과목 3가지 출력
//한명했을때 과목 3개 촤라락 떠야되는데 우케해야되는거지 이걸
package test;
import java.util.Scanner;
public class test 
{   
   private int[] kor;
   private int[] eng;
   private int[] mat;
   private int[] num,mid,fin,rpt,chul,tot;
   int hap =0;
   int ave =0;
   int a, b, c = 0;
   
   //필드선언
   private int n;
   
   //객체 생성 초기화
   public test()
   {
      Scanner s = new Scanner(System.in);
      kor = null;
      eng = null;
      mat = null;
      System.out.print("학생 수 입력 : ");
      n = s.nextInt();
      kor = new int[n];
      eng = new int[n];
      mat = new int[n];
      num = new int[n];
      mid = new int[n]; 
      fin = new int[n]; 
      rpt = new int[n]; 
      chul= new int[n];
      tot = new int[n];

      for(int i = 0; i<n; i++)
      {
         kor[i] = eng[i] = mat[i] = 0; 
      }
      
      for (int i=0; i<n; i++)
      { mid[i] = fin[i] = rpt[i] = chul[i] = tot[i] = 0;

      }
         
   }
   
   public void proc()
   {
       int[] kor_dapji = new int[10]; //정답 갯수 굳이 3개를 지정할 필요가 있을까?
       int[] eng_dapji = new int[10]; // for (i=0; i<3 i++)로 해도되나?
       int[] mat_dapji = new int[10]; // 과목 1,2,3으로 뜨게하고 하면되지 않을까?    
       
       int[] kor = new int[n];
       int[] eng = new int[n];
       int[] mat = new int[n];
       
       float kor_hap = 0;
       float eng_hap = 0;
       float mat_hap = 0;
       
       //어케 입력 받아야될까 이걸 한명의 과목3개의 점수 답이 떠야되는데
       for(int i=0; i<10; i++)
         {
            kor_dapji[i] = (int)(Math.random()*4+1); //1~4
            eng_dapji[i] = (int)(Math.random()*4+1); //이밑으로 두개는 지워도 별탈없을거강은데
            mat_dapji[i] = (int)(Math.random()*4+1); //뭐가 문젤까 나의 한계인가
         } //정답지 생성 - 이게 학생으로 뜨는건가... 
       
      for (int j=0; j<n; j++) //학생 수 n명 이게 위로 올라와야되는거 같은데
         {   
            //학생 답안지
            int[] stu_dapji = new int[10];
            
            //시험
            System.out.printf("stu%d",j+1);
            for(int i=0; i<10; i++)
            {
               stu_dapji[i] = (int)(Math.random()*4+1); //1~4
               System.out.printf("%2d",stu_dapji[i]);               
            }
            
            //채점 
            System.out.print("\n");
            int o = 0; //맞은 갯수
            System.out.print("국어:");
            for (int i=o; i<10; i++)
            {
               if(kor_dapji[i] == stu_dapji[i])
               {
                  o++;
                  System.out.print(" O");
               }
               else
                  System.out.print(" X");
            }//하 이거 어케 띄어쓰지
            kor[j] = o*10; //갯수
            System.out.print("  ");
            System.out.printf("국어점수 = %d", kor[j]);           
            a++;
            System.out.print("\n");
            
            int e = 0;
            System.out.print("영어:");
            for (int i=e; i<10; i++)
            {
               if(eng_dapji[i] == stu_dapji[i])
               {
                  e++;
                  System.out.print(" O");
               }
               else
                  System.out.print(" X");
            }
            eng[j] = e*10; //갯수
            System.out.print("  ");
            System.out.printf("영어점수 = %d", eng[j]);           
            b++;
            System.out.print("\n");
           
            int m = 0; //뒤에 출력되지않아 각각 선언해줌
            System.out.print("수학:");
            for (int i=m; i<10; i++)
            {
               if(mat_dapji[i] == stu_dapji[i])
               {
                  m++;
                  System.out.print(" O");
               }
               else
                  System.out.print(" X");
            }
            mat[j] = m*10; //갯수
            System.out.print("  ");
            System.out.printf("수학점수 = %d", mat[j]);           
            c++;
            //뒤에 o,x가 스킵됨 왜지?
            //위에만 보다 밑을 보지 못했다 그냥 이거도 추가해주면 되는것을..
            //print -> 그대로 출력이다 기억하자
            System.out.print("\n");
            System.out.print("\n"); //가독성용
            
            kor_hap += kor[j];
            eng_hap += eng[j];
            mat_hap += mat[j]; //출력되는 통로
            
         }//과목별 출력문
      
      System.out.println("-------------------------------------------");
      System.out.printf("각 과목 별 ave : 국어:%.1f  영어:%.1f  수학:%.1f\n", (kor_hap/n), (eng_hap/n), (mat_hap/n)); //과목별 ave
      //%f 쓸려면 float를 무조건 써줘야된다
      // 모르겠다 나의 한계다
   }//proc
   
   public void seung()
   {
	   int[] num = new int[n];
	   for (int i=0; i<n; i++)
	      {
	         mid[i] = (int)(Math.random()*30+1); //중간
	         fin[i] = (int)(Math.random()*40+1); //기말
	         rpt[i] = (int)(Math.random()*20+1); //리포트
	         chul[i] =(int)(Math.random()*10+1); //출석
	         System.out.printf("%3s %2d  %2d  %2d  %2d\n",
	                 mid[i],fin[i],rpt[i],chul[i]); //주의
	      }//모든 점수 랜덤으로 돌림
	   /*for(int i=0; i<n; i++)
	   {
		   tot = mid + fin + rpt + chul;
	   }*/ // 뭐가 문제야 넌...
	   
	   
   }//성적처리(seung)

   public void ghfwKr()
   {
	   int i = 0;
	   int ghf = 0; //홀수
	   int wkr = 0; //짝수
	   
	for (int i1=0; i1<50; i1++)
	   {
		   if ((i1+1)%2!=0)
		   {
			   ghf = ghf + (i1 + 1);
		   }
	   }//홀수 합
	System.out.printf("1~50 홀수 합 : " + ghf + "\n");
	
	for (int i1=0; i1<50; i1++)
	   {
		   if ((i1+1)%2==0)
		   {
			   wkr = wkr + (i1 + 1);
		   }
	   }//짝수 합
	System.out.printf("1~50 짝수 합 : " + wkr + "\n");
   }//ghfwKr
   
   public static void main(String[] arge)
   {
      int n=0; //학생 수 입력
        
      Scanner s = new Scanner(System.in);
       test t = new test();
       
      while(true)
         {
            System.out.println("+----------------+");
            System.out.println("| 1 : 채점        |");
            System.out.println("| 2 : 성적처리     |");
            System.out.println("| 3 : 구간합 		 |");
            System.out.println("| 4 : 종료        |");
            System.out.println("+----------------+");
            System.out.print("메뉴 선택 : ");
            String sel = s.next();
            
            if (sel.equals("1")) 
            {
               t.proc();
            }//채점   
            
            else if (sel.equals("2"))
            {
               t.seung();
            }//성적처리
            
            else if (sel.equals("3"))
            {
               t.ghfwKr();
            }
            
            else if (sel.equals("4"))
            {
               System.out.println("종료합니다.");
               break;
            }//종료
            
            else continue;
         }
         s.close();
   }
}