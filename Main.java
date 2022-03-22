import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner wejscie = new Scanner(System.in);
  int choice;
  double promien1, promien2, polekola, poleprost, a, b, poletrojk, polekwad;
  double pi=3.14;
  
  System.out.println("Wybierz opcje 1-4");
  System.out.println("1. Suma pól 2 kół");
  System.out.println("2. Pole prostokąta");
  System.out.println("3. Pole trójkąta prostokątnego");
  System.out.println("4. Suma pól 2 kwadratów");
  choice=wejscie.nextInt();

  switch (choice)
{
    case 1:
      System.out.println("Podaj promien 1 kola: ");
      promien1=wejscie.nextInt();
      System.out.println("Podaj promien 2 kola: ");
      promien2=wejscie.nextInt();
      promien1=Math.pow(promien1,2);
      promien2=Math.pow(promien2,2);
      polekola=pi*promien1+pi*promien2;
      System.out.println("Suma pól 2 kół wynosi: "+polekola);
      break;
    
  case 2:
    System.out.println("Podaj dlugosc boku a: ");
    a=wejscie.nextInt();
    System.out.println("Podaj dlugosc boku b: ");
    b=wejscie.nextInt();
    poleprost=a*b;
    System.out.println("Pole prostokąta wynosi: "+poleprost);
    break;

  case 3:
    System.out.println("Podaj długość podstawy trójkąta: ");
    a=wejscie.nextInt();
    System.out.println("Podaj wysokosc trójkąta: ");
    b=wejscie.nextInt();
    poletrojk=(a*b)/2;
    System.out.println("Pole trójkąta wynosi: "+poletrojk);
    break;
  case 4:
    System.out.println("Podaj długość krawędźi kwadratu pierwszego: ");
    a=wejscie.nextInt();
    System.out.println("Podaj długość krawędźi kwadratu drugiego: ");
    b=wejscie.nextInt();
    a=Math.pow(a,2);
    b=Math.pow(b,2);
    polekwad=a+b;
    System.out.println("Suma pol dwóch kwadratów wynosi: "+polekwad);
    break;
  }
  
  
  }
}