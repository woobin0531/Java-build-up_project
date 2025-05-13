public class ReturnArray {

    static int[] makeArray() { // 정수형 배열을 반환하는 메소드
        int temp[] = new int[4]; // 크기가 4인 배열 생성
        for (int i = 0; i < temp.length; i++)
            temp[i] = i; // 배열의 각 원소를 0, 1, 2, 3으로 초기화
        return temp; // 배열을 반환
    }

    public static void main(String[] args) {
        int[] intArray; // int형 1차원 배열 선언
        intArray = makeArray(); // makeArray 메소드로부터 배열을 전달받음
        for (int i = 0; i < intArray.length; i++)
            System.out.print(intArray[i] + " "); // 배열의 모든 원소를 출력
    }
}
