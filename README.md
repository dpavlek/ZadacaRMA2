# My project's README

Daniel Pavleković
DRC

Zadaća 2

	Potrebno je kreirati aplikaciju za konverziju mjernih jedinica. Aplikacija se sastoji iz četiri Activitya. Prvi sadrži gumbe sa slikama koji opisuju o kojem je pretvaranju riječ (npr. Temperatura,Udaljenost...). Klik na gumb eksplicitnim Intentom pokreće Activity za željenu konverziju. U svakom od Activitya za konverziju potrebno je prikupiti korisnički unos vrijednosti, tip jedinice u kojoj je unešeno (koristiti spinner) i izračunati rezultat koji se zatim šalje u Activity namjenjen prikazu rezultata korištenjem extra podataka.

Opis mojeg rješenja

	Aplikacija se sastoji od 6 Activity-ja. Prvi Activity je MainActivity, koji se prvi pokreće pri pokretanju aplikacije. On sadrži 4 ImageButtona koji vode na druge activity-je. Prvi ImageButton(sa slikom brzinomjera) vodi na SpeedActivity, (u smjeru kazaljke na satu) drugi ImageButton vodi na TimeActivity, treći na DistanceActivity, a četvrti na CurrencyActivity. Sva četiri Activity-ja su gotovo jednaka, s tim da su jedine razlike u naslovu, jedinicama s kojima rade, te u klasama s kojima “rade”. Svaki od ta 4 activity-ja se sastoji od naziva konvertera na vrhu, EditText-a za unos decimalne vrijednosti, Spinnera za odabir vrijednosti koju želimo pretvoriti, te Spinner za odabir vrijednosti u koju želimo pretvoriti i Buttona convert koji otvara activity za prikaz rezultata. Problem je bio pri uporabi Spinnera, jer koriste Adaptere, međutim rješenje je pronađeno na StackOverflow-u(link na dnu). Pri postavljanju Spinnera je također postavljeno da je defaultna vrjiednost prva vrijednost koja se može odabrati, odnosno prva vrijednost u String array-u. Kod klika na button “convert” se stvara novi objekt odgovarajuće klase(speed, time, currency ili distance), parsira se vrijednost u EditTextu, postavljaju se vrijednosti u novokreiranom objektu pomoću metode setInput, izračuna se nova vrijednost pomoću metode Convert, te se stvara novi eksplicitni Intent u koji se dodaju sve vrijednosti(vrsta jedinice koju želimo pretvoriti, vrsta jedinice u koju pretvaramo, vrijednost početne jedinice i vrijednost pretvorene jedinice), te na kraju pokrećemo novi Activity s tim Intentom. U klasama speed, time, distance i currency je problem bio kako dohvatiti vrijednosti iz datoteke strings.xml odnosno nizove iz R.array, međutim to je riješeno tako da se pri inicijalizaciji objekta klase objektu mora predati Context, te se putem tog Contexta može pristupati poljima Stringova. Metoda Convert je riješena pomoću if-else naredbi gdje su se uspoređivale vrijednosti dvaju Spinnera, tj. uspoređivale su se vrijednosti Spinnera s vrijednostima u String arrayu. Cijela metoda je napisana pomoću try-catch petlje u slučaju da se dogodi da korisnik nije upisao nikakvu vrijednost.

Linkovi na kojima su nađena riješenja za probleme:
http://stackoverflow.com/questions/5787809/get-spinner-selected-items-text
http://stackoverflow.com/questions/19876488/android-string-array-from-xml-file-to-listview
http://stackoverflow.com/questions/10275348/what-is-androidems-attribute-in-edit-text
http://stackoverflow.com/questions/5787809/get-spinner-selected-items-text
http://stackoverflow.com/questions/7666589/using-getresources-in-non-activity-class
http://stackoverflow.com/questions/4338400/getresources-does-not-work-undefined-java
https://www.tutorialspoint.com/java/lang/math_pow.htm
http://stackoverflow.com/questions/7474319/how-to-parse-a-double-from-edittext-to-textview-android
http://stackoverflow.com/questions/9366280/android-round-to-2-decimal-places
http://stackoverflow.com/questions/16143562/string-comparison-android
http://stackoverflow.com/questions/10457135/how-to-add-border-around-linear-layout-except-at-the-bottom
http://stackoverflow.com/questions/2944822/format-double-value-in-scientific-notation


