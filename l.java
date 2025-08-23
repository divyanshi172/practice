
public class l {

//     public boolean pallidrome(int arr[], int i, int j){
        
//         while (i<=j){
//             if (arr[i]!=arr[j]){
//                 System.out.println(false);
//                 break;
//             }
//             else {
                
//                 i++;
//                 j--;
                
            
//         }
        
//              return     true;   }
//     }
// public void main(String[] args) {

// // int a=1;
// // char ch='A';
// // for(int i=1; i<=5 ; i++){
// //     for (char j=1; j<=5; j++){
// // if(j<=i){
// //     System.out.print((char)(i+64));
// // }
// // else{
// //     System.out.print(" ");
// // }


// //     }
// // System.out.println();}
// // int a=1;
// // char ch='A';
// // for(int i=1; i<=5 ; i++){
// //     for (char j=1; j<=5; j++){
// // if(j<=i){
// //     System.out.print((char)(j+64));
// // }
// // else{
// //     System.out.print(" ");
// // }


// //     }
// // System.out.println();}
// //  int n=5;
// // for (int i=0; i<n; i++){
// //      for(int j=0; j<=2*n-1; j++){
// //         if(j>=n-i && j<=n+i){
            
// //             System.out.print("*");
// //         }
// //         else{
// //             System.out.print(" ");
// //         }
    
// //      }
// //      System.out.println();
// //      }
    
// // } work to be done 


// // Array 
// // array is a data stucture used to store multiple value  in a single variale
// //declaration
// // int a[];
// //int []a;
// // intialization
// // in c++ >>with size intialization can  be possibe but in case of java it is not possible
// //
// // this is the way to give size int a[]=new int [5];
// //int a[]=new int[]{1,2,3,4,5}
// // with the NEW keyword the memory of stack is converted into heap
// //


// //int arr[5];
// // int arr[5]=new int[5];

// //         int n = 10;
// //         int a = 0, b = 1;

// //         for (int i = 1; i <= n; i++) {
// //             System.out.print(a + " ");
// //             int c = a + b;
// //             a = b;
// //             b = c;
// //         }
// // int n=10;
// //         for(int i=0; i<n; i++){
// //             for(int j=0; j<n; j++){

// //             }

            
// //         }

// //         int n=4;
// //         for(int i=1;i<=n;i++){
// //             int y=i;
            
// //             boolean me=false;
// //             for(int j=1;j<=2*n-1;j++){
// //                 if(j>=n-i+1 && j<=n+i-1){
// //                     if(j>=n-i+1 && me==false){
// //                        System.out.print(y);
// //                        y--;
// //                        if(y==1){
// //                        me =true;
// //                     }
// //                     }
// //                     else if(me){
// //                         System.out.print(y);
// //                          y++;
// //                     }
// //                 }else{
// //                     System.out.print(" ");
// //                 } 
// //             }
// //             System.out.println();
// //         }
    

        




// //  }}
// int arr[]= {1,2,1,1};
// int n= arr.length;
// int i=0;
// int j=n-1;
// // int max=arr[0];
// // for(int i=0; i<n; i++){
// //     if (arr[i]>max){
// // max=arr[i];
// //     }
// // }
// // System.out.println(max);


// int arr []= {1,2,3,2,1};
// int n=arr.length;
// int j= n-1;
public static void  main (String[]args){
    
//     int count=0;
// for(int i=0; i<n-1; i++){
    
// if(arr[i]!=0){
//    arr[count]=arr[i];
//    ++count;
// }
// }


// for(int i=count; i<n; i++){
//     arr[i]=0;
// }
// for(int a:arr){
//     System.out.println(a);
// }
// for(int i=0; i<n; i++){
//     boolean duplicate= false;
//     for(int j=i+1; j<n; j++){
//         if(arr[i]==arr[j] && arr[i]!=-1 ){
// duplicate=true;
// arr[j]=-1;
//         }
//     }
//     if(!duplicate && arr[i]!=-1)
//     {
//         System.out.println(arr[i]);
//     }
// }
// int count=0;
// for(int i=0; i<n; ++i){
//     if(arr[i]!=0){
//         arr[count]=arr[i];
//        ++count;
//     }
// }
// for (int index = count; index < n; index++) {
//     arr[index]=0;
// }
// for (int x : arr) {
//     System.out.println(x);
// }
// for(int i=0; i<n; i++){
//     boolean dublicate=false;
//     for(int j=i+1;j<n; ++j){
        
// }

// int arr[]= {0,1,3,5,6,8};
// int n= arr.length-1;
// for(int i=0; i<n; i++){
//     if(arr[i+1]-arr[i]>1){

//     System.out.println(arr[i]+1);}
// }

// }}
// 
// ---------------------que-3
// int arr[]= {1,1,1,2,3,4,4,3,2};
// int target=13;
// int n=arr.length;
// for(int i=0; i<n; i++){
//     for(int j=i+1; j<n; j++){
//         if(arr[i]+arr[j]==target){
//             System.out.println(arr[i]+"+"+arr[j]+"=" +target);
//         }
//     }
// }



// }}
// 
// int arr[]= {1,1,1,1,3,3,3,4,4,4,5,5,5,6,7};
// int n= arr.length;
// int arr1[]=new int[n];
// int x=0;
// for(int i=1; i<n ; i++){
// if(arr[i]!=arr[i-1]){
// arr1[x]=arr[i-1];
// x++;
// }
// }

// for(int i=0; i<x;i++){
//     System.out.println(arr1[i]);
// }

// int arr[]={1,2,4,5,8,9};
// int mis=2;
// int n= arr.length+mis;
// for(int i=1; i<=n; i++){
//     boolean value=false;
//     for(int j=0; j<arr.length; j++){
//         if(arr[j]==i){
//             value=true;
//         }
//     }
//     if(!value){
//         System.out.println(i);
//     }
// int arr[]=  {1,2,2,1,3,3,1,1,4};
// int n= arr.length;
// int i=0;
// int j=1;
// while(i<n){

// }
 //pallidome ,reverse , balance parenthesis covered in the class i missed
//  
// 
// 

// 
// String str1="listen";
// String str2="sileno";
// int n=str1.length();
// int count[]=new int[256];
// for(int i=0;i<n; ++i){
//     count[str1.charAt(i)]++;
//     count[str2.charAt(i)]++;
// }
// for(int i=0; i<256; i++){
//     if(count[i]!=0){
// System.out.print("this is not anagram");
// return;
//     }
// }
// System.out.println("anagram");
}
}
