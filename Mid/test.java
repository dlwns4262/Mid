//�л� n���� �Է���������
//�л� 1������ �������� ���
//�л�1�� �������� ���;ߵǴϱ� �л��ؿ� ������ ���ߵǴ°ǰ�?
//int n -> �л��� �Է� proc���� �Է¹��� �л��� �� ��� -> ���� �л�����ŭ ���� 3���� ���
//�Ѹ������� ���� 3�� �Ҷ�� ���ߵǴµ� �����ؾߵǴ°��� �̰�
package stu;
import java.util.Scanner;
public class test 
{   
   private int[] kor;
   private int[] eng;
   private int[] mat;
   int hap =0;
   int ave =0;
   int a, b, c = 0;
   
   private int n;
   
   //��ü ���� �ʱ�ȭ
   public test()
   {
      Scanner s = new Scanner(System.in);
      kor = null;
      eng = null;
      mat = null;
      System.out.print("�л� �� �Է� : ");
      n = s.nextInt();
      kor = new int[n];
      eng = new int[n];
      mat = new int[n];

      for(int i = 0; i<n; i++)
      {
         kor[i] = eng[i] = mat[i] = 0; 
      }
         
   }
   
   public void proc()
   {
      int[] kor_dapji = new int[10]; //���� ���� ���� 3���� ������ �ʿ䰡 ������?
       int[] eng_dapji = new int[10]; // for (i=0; i<3 i++)�� �ص��ǳ�?
       int[] mat_dapji = new int[10]; // ���� 1,2,3���� �߰��ϰ� �ϸ���� ������?    
       
       int[] kor = new int[n];
       int[] eng = new int[n];
       int[] mat = new int[n];
       
       float kor_hap = 0;
       float eng_hap = 0;
       float mat_hap = 0;
       
       //���� �Է� �޾ƾߵɱ� �̰� �Ѹ��� ����3���� ���� ���� ���ߵǴµ�
       for(int i=0; i<10; i++)
         {
            kor_dapji[i] = (int)(Math.random()*4+1); //1~4
            eng_dapji[i] = (int)(Math.random()*4+1); //�̹����� �ΰ��� ������ ��Ż�����Ű�����
            mat_dapji[i] = (int)(Math.random()*4+1); //���� ������ ���� �Ѱ��ΰ�
         } //������ ���� - �̰� �л����� �ߴ°ǰ�... 
       
      for (int j=0; j<n; j++) //�л� �� n�� �̰� ���� �ö�;ߵǴ°� ������
         {   
            //�л� �����
            int[] stu_dapji = new int[10];
            
            //����
            System.out.printf("stu%d",j+1);
            for(int i=0; i<10; i++)
            {
               stu_dapji[i] = (int)(Math.random()*4+1); //1~4
               System.out.printf("%2d",stu_dapji[i]);               
            }
            
            //ä�� 
            System.out.print("\n");
            int o = 0; //���� ����
            System.out.print("����:");
            for (int i=o; i<10; i++)
            {
               if(kor_dapji[i] == stu_dapji[i])
               {
                  o++;
                  System.out.print(" O");
               }
               else
                  System.out.print(" X");
            }//�� �̰� ���� ����
            kor[j] = o*10; //����
            System.out.print("  ");
            System.out.printf("�������� = %d", kor[j]);           
            a++;
            System.out.print("\n");
            
            int e = 0;
            System.out.print("����:");
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
            eng[j] = e*10; //����
            System.out.print("  ");
            System.out.printf("�������� = %d", eng[j]);           
            b++;
            System.out.print("\n");
           
            int m = 0; //�ڿ� ��µ����ʾ� ���� ��������
            System.out.print("����:");
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
            mat[j] = m*10; //����
            System.out.print("  ");
            System.out.printf("�������� = %d", mat[j]);           
            c++;
            //�ڿ� o,x�� ��ŵ�� ����?
            //������ ���� ���� ���� ���ߴ� �׳� �̰ŵ� �߰����ָ� �Ǵ°���..
            //print -> �״�� ����̴� �������
            System.out.print("\n");
            System.out.print("\n"); //��������
            
            kor_hap += kor[j];
            eng_hap += eng[j];
            mat_hap += mat[j]; //��µǴ� ���
            
         }//���� ��¹�
      
      System.out.println("-------------------------------------------");
      System.out.printf("�� ���� �� ave : ����:%.1f  ����:%.1f  ����:%.1f\n", (kor_hap/n), (eng_hap/n), (mat_hap/n)); //���� ave
      //%f ������ float�� ������ ����ߵȴ�
      // �𸣰ڴ� ���� �Ѱ��
   }//proc
   
   public static void main(String[] arge)
   {
      int n=0; //�л� �� �Է�
        
      Scanner s = new Scanner(System.in);
       test t = new test();
       
      while(true)
         {
            System.out.println("+----------------+");
            System.out.println("| 1 : ä��        |");
            System.out.println("| 2 : ����        |");
            System.out.println("+----------------+");
            System.out.print("�޴� ���� : ");
            String sel = s.next();
            
            if (sel.equals("1")) 
            {
               t.proc();
            }//ä��            
                          
            else if (sel.equals("2"))
            {
               System.out.println("�����մϴ�.");
               break;
            }//����
            
            else continue;
         }
         s.close();
   }
}