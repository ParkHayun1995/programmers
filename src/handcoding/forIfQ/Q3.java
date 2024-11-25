package handcoding.forIfQ;
// 구구단 3단에서 4의 배수는 제외하고 출력
public class Q3 {
  public static void main(String[] args) {
    int count = 0;
    for (int i=1; i<=9; i++){
      if(!(((3*i)%4)==0)){
        count++;
        System.out.println("4의 배수를 제외한 3단 : "+3*i);
      }
    }
    System.out.println("총 개수 : " + count);
  }
}
