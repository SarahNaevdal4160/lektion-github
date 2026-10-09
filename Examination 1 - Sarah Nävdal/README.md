Exam 1


1. Datasäkerhet/Inkapsling

För att skydda kontots uppgifter har jag använt inkapsling genom att göra variablerna owner och balance till private i Account.java. För att läsa eller ändra i dessa uppgifter måste man istället gå via de publika metoderna getters, deposit och withdraw. Om jag inte hade gjort detta hade vem som helst kunnat ändra saldot utan begränsningar vilket hade kunnat leda till felaktiga värden eller att saldot blir negativt.   


2. Skapande-mönster (Factory)

Kontot skapas via registret för att alla konton som läggs till ska skapas och sparas på samma sätt. Det gör också att Main inte behöver ha direktkontakt med hur konton skapas vilket minskar risken för buggar och gör koden lättare att redigera. 


3. Flöde

	Beskrivning av meny-valet för insättning.

	1. Användaren väljer menyval 3 i menyn och skriver in namnet på kontoägaren.
	
	2. Main-klassen tar emot namnet via scannern och skickar det till 		   	   AccountRegister-objektet genom metoden findAccount().

	3. Registret letar i ArrayList och returnerar Account-registret samt 		   	   tillgängligt saldo om kontot hittas.      

	4. Main ber användaren att mata in insättnings-beloppet. Användaren matar in 	   	   beloppet 300. Main kör metoden deposit(amount) direkt i det hittade Account-		   objektet. 

	5. Account-objektet uppdaterar saldot med 300 och skriver ut det nya saldot i	
	   konsolen.  


4. Reflektion 

När jag körde fast eller stötte på felmeddelanden kollade jag i konsolen var felet            låg och förstod jag inte använde jag oftast AI som bollplank. Ett exempel var var när koden inte fungerade då jag tagit emot automatiska förslag i VS Code, vilket jag tycker underlättar inmatningen men ibland skriver den ut fler rader än vad jag tänkt, då visade det sig att samma kod hade hamnat på två olika ställen och måsvingarna hade hamnat fel. Ett annat fel jag gjorde var att skriva ett utropstecken i mitt meddelande till en commit. Jag har kopierat koden eller delar av den och skickat till AI som ibland hittade felet men ibland även påpekade fel som inte fanns där.     