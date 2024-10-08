import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        String str;
        String value;
        while(true) {
            System.out.print("SHELL > ");
            Scanner sc = new Scanner(System.in);
            String jarFilePath = "/Users/iyunju/SSD/out/artifacts/untitled_jar/untitled.jar";
            String javaCommand = "java";
            str = sc.next();
            String[] command = {};

            ProcessBuilder pb;


            if (str.equals("exit")) {
                System.out.println("BYE");
                break;
            }
            else if (str.equals("help")) {
                System.out.println("exit 입력-> 종료");
                System.out.println("help 입력-> 명령어 사용방법 출력");
                System.out.println("write num 0xAAAABBBB(값)  입력-> num번 LBA에 값 0xAAAABBBB 저장 ");
                System.out.println("read num 입력-> num번 LBA를 읽어 값을 출력");
                System.out.println("fullwrite 0xAAAABBBB(값) 입력-> 모든 LBA에 값 0xABCDFFF 가 적힘");
                System.out.println("fullread 입력-> ssd 전체 값이 모두 화면에 출력");
                System.out.println("없는 명령어를 수행하는 경우 INVALID COMMAND가 출력됩니다.");
            }
            else if (str.equals("fullread")) {
                command = new String[]{javaCommand, "-jar", jarFilePath, str};
                pb = new ProcessBuilder(command);
                Process process = pb.start();

            }
            else if (str.equals("fullwrite")) {
                value = sc.next();
                command = new String[]{javaCommand, "-jar", jarFilePath, str,value};
                pb = new ProcessBuilder(command);
                Process process = pb.start();



            }
            else if (str.equals("read")) {
                String num = sc.next();
//                if(num<0 || num>99){
//                    System.out.println("LBA 범위 초과");
//                    continue;
//                }

                command = new String[]{javaCommand, "-jar", jarFilePath, str, num };
                pb = new ProcessBuilder(command);
                Process process = pb.start();
            }
            else if (str.equals("write")) {
                String num = sc.next();
//                if(num<0 || num>99){
//                    System.out.println("LBA 범위 초과");
//                    continue;
//                }
                value = sc.next();
                command = new String[]{javaCommand, "-jar", jarFilePath, str, num, value};
                pb = new ProcessBuilder(command);
                Process process = pb.start();
            }
            else{
                System.out.println("INVALID COMMAND");
            }

        }

    }
}

