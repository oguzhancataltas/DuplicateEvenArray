public class Main {
    static boolean isTrue(int[] arr, int value) {
        for (int a : arr) {
            if (a == value){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        int[] list = {3, 4, 5, 2, 4, 6, 3, 14, 5, 4, 2, 7, 6, 14};
        int[] duplicate = new int[11];
        int index = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] % 2 == 0) && (list[i] == list[j])) {
                    if (isTrue(duplicate, list[j])) {
                        duplicate[index++] = list[j];
                        break;
                    }
                }
            }
        }

        for (int d : duplicate){
            if (d != 0 ){
                System.out.print(d + ", ");
            }
        }

    }
}
