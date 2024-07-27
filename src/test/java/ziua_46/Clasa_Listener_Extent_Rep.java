package ziua_46;

public class Clasa_Listener_Extent_Rep {

    public static void main(String[] args) {

        System.out.println("Clasa LISTENER & EXTENT REPORT");

/*
TsetNG Listeners

1)  se genereaza clasa dorita CLASA1
2)  se genereaza clasa LISTENER
3)  se genereaza fisierul XML care include ambele clase , CLASA1 + LISTENER

Avem 2 metodfe prin care putem sa inseram o clasa LISTENER

Metoda 1
--------
class LISTENET implements ITestListener
{

}


Metoda 2
--------
class LISTENET extends TestListenerAdapter
{

}


TestListener mereu o sa extinda TestListenerAfterClass
Avem un ON TEST ACCESS metter

TestListenerAdapter este o clasa care se poate extinde in alta clasa. DSare pentru a lucra trebuie s-o suprascriem

Clasa LISTENER , pentru ca are toate metodele in ea trebuie implementata
Pentru implementare folosim TESTNG LISTENERS si folosim documentatia de acolo:
https://testng.org/testng_listeners.html

De aici luam ITestListener - dam click pe ea si copiem ce este acolo.
Cautam in lista de mai jos :
https://testng.org/#_testng_documentation
punctul - 3.17. TestNG Listeners si din lista acestuia alegem documentatia pentru ITestListener - docs + javadocs
si avem link-urile:
docs        =>  https://testng.org/logging_and_results.html#_logging_listeners
javadocs    =>  https://javadoc.io/static/org.testng/testng/7.9.0/org/testng/ITestListener.html

onStart     - se executa daor o singura data la inceput
onFinish    - se execuat o singura data la final
onTestStart - se executa pentru fiecare test in parte

------------------------------------------

Extents Report








 */


    }

}
