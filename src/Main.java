public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hello George");

        int  i   , j ; // if the var initiliz for the first time we can't do int k +=1;
        boolean bool =true , bool2 = true;

        System.out.println();

        (i) = 1 ;
        j = 1 ;
        i = i + 1 ; i = (j++) + j + 1 ; i = i^j ;
        i +=1; i += j ; i *=j+5+i;i /= j ; i %= j;i ^=j+j;
        i++; ++j ; --j;j--;


        if (bool != bool2 || i++ < 9 && 7 > 7 || i > j || false || "mhmad" == "n" ||( bool ==bool2 )== false || j==(j=i+j)  || (i=5)>4)
            for (  i+= i * j + 1 ; true  ; i+=5+j ){
                System.out.println("George");
            }
    }
}
