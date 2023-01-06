Arrays.sort(arr);

       int i=0;

       int j=n-1;

       while (i<j) {

           if (arr[i] + arr[j] == x) {

               return true;

           }

           if (arr[i] + arr[j] < x) {

               i++;

           }

           if (arr[i] + arr[j] > x) {

               j--;

 

           }

       }

        return false;
