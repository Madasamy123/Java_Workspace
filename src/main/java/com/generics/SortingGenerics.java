package com.generics;



public class SortingGenerics<T extends  Comparable<T>>{

    public void sortArray(T[] array){

        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[j].compareTo(array[i])>0){
                    T temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;

                }
            }

        }

    }
    public void print(T[] array){

        for(T result:array){
            System.out.println(result);
        }
    }


    public static void main(String[] args) {
        SortingGenerics<String>genericsClass=new SortingGenerics<>();

        String [] names={"Madasamy","Anand","Suriya","Muthu Raj","Kumar"};

        genericsClass.sortArray(names);
        genericsClass.print(names);

//        System.out.println(names);
//
//        for(String name:names){
//            System.out.println(name);
//        }


        SortingGenerics<Integer>genericsNumber=new SortingGenerics<>();

        Integer [] numbers={10,15,23,45};

        genericsNumber.sortArray(numbers);
        genericsNumber.print(numbers);


        SortingGenerics<Character>genericsChar=new SortingGenerics<>();

        Character [] Gchar={'A','B','C','D'};

        genericsChar.sortArray(Gchar);
        genericsChar.print(Gchar);


    }
}
