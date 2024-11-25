package handcoding.forIfQ;

import java.util.Arrays; // 정렬을 위한 라이브러리

public class Q4 {
  public static void main(String[] args) {
    int[] ball = new int[45];

    // 공 배열 초기화 (1부터 45까지)
    for (int i = 0; i < ball.length; i++) {
      ball[i] = i + 1;
    }

    // 공 섞기
    int tmp = 0;
    int lotto = 0;
    for (int i = 0; i < 7777777; i++) {
      lotto = (int) (Math.random() * 45); // 0~44 범위의 랜덤 인덱스
      tmp = ball[0];
      ball[0] = ball[lotto];
      ball[lotto] = tmp;
    }

    // 앞에서 6개의 번호 선택
    int[] lottoNumbers = Arrays.copyOfRange(ball, 0, 6);

    // 오름차순 정렬
    Arrays.sort(lottoNumbers);

    // 출력
    System.out.println("추출된 로또 번호 (오름차순): " + Arrays.toString(lottoNumbers));
  }
}