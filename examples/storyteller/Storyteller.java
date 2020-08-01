package storyteller;
import me.auropol.bluemint.primitive.Container;
import me.auropol.bluemint.primitive.Wrapper;
import me.auropol.bluemint.util.RandStream;

public class Storyteller{
    public static void main(String[] args) {
        final int numYear = Wrapper.wrap().pickRandomlyFromRange(2069, 3969);
        final int numPlanet = Wrapper.wrap().pickRandomlyFromRange(1, 9);
        final String name = RandStream.generateRandomLetter(true) + RandStream.generateRandomLetter(false) + RandStream.generateRandomLetter(false) + RandStream.generateRandomLetter(false);
        final String planetName = RandStream.generateRandomLetter(true) + RandStream.generateRandomLetter(true) + RandStream.generateRandomLetter(true) + RandStream.generateRandomLetter(true) + Wrapper.wrap().pickRandomlyFromRange(1, 20000);
        final String starName = RandStream.generateRandomLetter(true) + RandStream.generateRandomLetter(true) + RandStream.generateRandomLetter(true) + RandStream.generateRandomLetter(true) + Wrapper.wrap().pickRandomlyFromRange(1, 20000) + RandStream.generateRandomLetter(false);
        final String[] person = Container.manage().createArrayString("Entity", "AI");
        final String[] work = Container.manage().createArrayString("Engineer, Astrobiologist", "Xenobiologist", "Drive Engineer", "Fuel Maintainer", "Cargo Manager", "Repairer", "Colonist", "Physicist", "Scientist");
        final String[] log = Container.manage().createArrayString("log snippet", "personal information device");
        final String[] initWord = Container.manage().createArrayString("Hello, this is", "Hi, that's", "Hi, this is", "Hello, that's");
        final String[] arrival = Container.manage().createArrayString("We arrived at", "We are now at");
        final String[] starClass = Container.manage().createArrayString("Red dwarf", "White dwarf", "Blue star", "Yellow star" + "Red giant");
        final String[] likeStar = Container.manage().createArrayString("like our star", "like a star from sci-fi", "like a star which you can see on an alien world");
        final String[] planetClass = Container.manage().createArrayString("Volcanic one", "Bountiful one", "Freezing one", "Irradiated one", "Oceanic one", "Superheated one");
        final String[] landingCause = Container.manage().createArrayString("our ship is very damaged and our last chance to save us from dying in space was warping in the nearest system that was in our range", "our mission is to colonize new planets, and this one is great for that", "this planet has a big energetic potential", "we found an interesting flora and fauna on the planet. Some of the fauna is highly intelligent and formed a primitive civilization !", "our ship contains a deadly alien life form, and this is the last chance to get rid of that.");
        final String[] wonder = Container.manage().createArrayString("what we will discover here.", "if someone alien for this planet like us wasn't here before us.", "if our mission will be successful after all.");
        String pers = RandStream.pickFrom(person);
        String wor = RandStream.pickFrom(work);
        String lo = RandStream.pickFrom(log);
        String initWor = RandStream.pickFrom(initWord);
        String arrivalL = RandStream.pickFrom(arrival);
        String starClas = RandStream.pickFrom(starClass);
        String likeSta = RandStream.pickFrom(likeStar);
        String planeClas = RandStream.pickFrom(planetClass);
        String landingCaus = RandStream.pickFrom(landingCause);
        String wonde = RandStream.pickFrom(wonder);
        System.out.println("YEAR" + " " + String.valueOf(numYear) + " " + pers + " " + wor + " " + name + " " + "'s" + " " + lo  + " "+ "." + " " + "The" + " " + lo + " " + "contains" + " " + " " + "this :");
        System.out.println(initWor + " "  + pers+ " " + wor + " " + name+ " " + ".");
        System.out.println(arrivalL+ " " + starName+ " " + "which is a "+ " " +  starClas+ " " + likeSta+ " " + ".");
        System.out.println("This star system has"+ " " + String.valueOf(numPlanet)+ " " + "planets" + " "+ "and we want to land on the"+ " " + planeClas + " "+ "which we named" + " " + planetName + " "+ "because" + " "+ landingCaus + " "+ ".");
        System.out.println("I wonder,"+ " " + wonde + " ");
    }
}
