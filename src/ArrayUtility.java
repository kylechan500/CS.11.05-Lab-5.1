public class ArrayUtility {
    public static void print(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(i!=0) System.out.print(", ");
            System.out.print(arr[i]);
        }
    }

    public static int sum(int[] arrpublic class ArrayUtility {
        public static void print (int[] arr) {
            for(int i=0;i<arr.length;i++){
                if(i!=0) System.out.print(", ");
                System.out.print(arr[i]);
            }
        }

        public static int sum (int[] arr) {
            int sum=0;
            for(int i=0;i<arr.length;i++){
                sum+=arr[i];
            }
            return sum;
        }

        public static double average(int[] arr) {
            double s = sum(arr);
            double avg = s/arr.length;
            int ok = (int)(avg*100);
            return (double)ok/100;
        }

        public static int minimum(int[] arr) {
            int m = 10000;
            for(int i=0;i<arr.length;i++){
                if(arr[i]<m){
                    m=arr[i];
                }
            }
            return m;
        }

        public static int maximum(int[] arr) {
            int m = -1;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>m){
                    m=arr[i];
                }
            }
            return m;
        }

        public static int evenCount(int[] arr) {
            int cnt=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]%2==0) cnt++;
            }
            return cnt;
        }

        public static int[] reverseOne(int[] arr) {
            int[] ok = new int[arr.length];
            for(int i=arr.length-1;i>=0;i--){
                ok[arr.length-i-1]=arr[i];
            }
            return ok;
        }

        public static void reverseTwo(int[] arr) {
            for(int i=0;i<arr.length/2;i++){
                int x = arr[i];
                arr[i]=arr[arr.length-1-i];
                arr[arr.length-1-i]=x;
            }
        }

        public static boolean linearSearchInt(int[] arr, int num) {
            for(int i=0;i<arr.length;i++){
                if(arr[i]==num) return true;
            }
            return false;
        }

        public static boolean linearSearchString(String[] arr, String str) {
            for(int i=0;i<arr.length;i++){
                if(arr[i].equals(str)) return true;
            }
            return false;
        }

        public static void multiplyByTwo(int[] array) {
            for(int i=0;i<array.length;i++){
                array[i]*=2;
            }
        }

        public static void multiplyByN(int[] array, int n) {
            for(int i=0;i<array.length;i++){
                array[i]*=n;
            }
        }

        public static String toString(int[] array) {
            String ans = "";
            for(int i=0;i<array.length;i++){
                if(i!=0) ans += ", ";
                ans += array[i];
            }
            return ans;
        }

        public static boolean twoSum(int[] array, int num) {
            for(int i=0;i<array.length;i++){
                for(int j=0;j<array.length;j++){
                    if(i==j) continue;
                    if(array[i]+array[j]==num) return true;
                }
            }
            return false;
        }

        public static void shiftRight(int[] array) {
            int x = array[array.length-1];
            for(int i=array.length-1;i>=1;i--){
                array[i]=array[i-1];
            }
            array[0]=x;
        }

        public static void shiftLeft(int[] array) {
            int x = array[0];
            for(int i=0;i<array.length-1;i++){
                array[i]=array[i+1];
            }
            array[array.length-1]=x;
        }

        public static void shiftRightNTimes(int[] array, int n) {
            for(int i=1;i<=n;i++){
                shiftRight(array);
            }
        }

        public static void shiftLeftNTimes(int[] array, int n) {
            for(int i=1;i<=n;i++){
                shiftLeft(array);
            }
        }

    }
) {
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum;
    }

    public static double average(int[] array) {
        double s = sum(array);
        double avg = s/array.length;
        int ok = (int)(avg*100);
        return (double)ok/100;
    }

    public static int minimum(int[] array) {
        int m = 10000;
        for(int i=0;i<array.length;i++){
            if(array[i]<m){
                m=array[i];
            }
        }
        return m;
    }

    public static int maximum(int[] array) {
        int m = -1;
        for(int i=0;i<array.length;i++){
            if(array[i]>m){
                m=array[i];
            }
        }
        return m;
    }

    public static int evenCount(int[] array) {
        int cnt=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0) cnt++;
        }
        return cnt;
    }

    public static int[] reverseOne(int[] array) {
        int[] ok = new int[array.length];
        for(int i=array.length-1;i>=0;i--){
            ok[array.length-i-1]=array[i];
        }
        return ok;
    }

    public static void reverseTwo(int[] arr) {
        for(int i=0;i<arr.length/2;i++){
            int x = arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=x;
        }
    }

    public static boolean linearSearchInt(int[] arr, int a) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a) return true;
        }
        return false;
    }

    public static boolean linearSearchString(String[] arr, String str) {
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(str)) return true;
        }
        return false;
    }

    public static void multiplyByTwo(int[] arr) {
        for(int i=0;i<arr.length;i++){
            arr[i]*=2;
        }
    }

    public static void multiplyByN(int[] arr, int a) {
        for(int i=0;i<arr.length;i++){
            arr[i]*=a;
        }
    }

    public static String toString(int[] arr) {
        String ans = "";
        for(int i=0;i<arr.length;i++){
            if(i!=0) ans += ", ";
            ans += arr[i];
        }
        return ans;
    }

    public static boolean twoSum(int[] arr, int a) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j) continue;
                if(arr[i]+arr[j]==a) return true;
            }
        }
        return false;
    }

    public static void shiftRight(int[] arr) {
        int x = arr[arr.length-1];
        for(int i=arr.length-1;i>=1;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=x;
    }

    public static void shiftLeft(int[] arr) {
        int x = arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=x;
    }

    public static void shiftRightNTimes(int[] arr, int n) {
        for(int i=1;i<=n;i++){
            shiftRight(arr);
        }
    }

    public static void shiftLeftNTimes(int[] arr, int n) {
        for(int i=1;i<=n;i++){
            shiftLeft(arr);
        }
    }

}
