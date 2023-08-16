

                      //test 2                    date 24.9.2022



package test;

public class test_2 {

final int a = 45;
static int b = 45;
int c = a + b;
String name;

public void actor() {

//Ex c = 20; ipdi syso ku mela koduthomna syso indha value va print ku eduthukum

System.out.println(c);
c = 20;

//idhuve c = 20; nu syso kum keela koduthomna idhuku first preferance kodukdhu
//class la irukura c oda value c = 90  ku dhan first preference kodukum.

int a = 50;
a = 100;
System.out.println(a + c);
}

private void doctor() {
System.out.println(a + " " + name);
}

public static void main(String[] args) {

	test_2 obj = new test_2();
String ajith = obj.name;

//return type edukanum ipo first obj.name type panitu ctrl+2 kodukanum then side la option
//varum adhula L ok pananum.then string pakathula null katum la adhula nama new va Ex ajith 
//nu type paniklam edhachum type paniklam or old name Ex name laye irukalam.

ajith = "gokul";

//then ajith nu irukarthuku = ku aduthu output varathuku name kodukanum

System.out.println(ajith);
System.out.println(obj.c);
obj.actor();
obj.doctor();
}

}
