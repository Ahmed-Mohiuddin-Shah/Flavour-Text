import java.security.SecureRandom;

/**
 * @author Ahmed Mohiuddin Shah
 */

/**
 * This is a abstract class which is used to generate random loading texts and
 * returns them as strings. No need to initialize this class to use it.
 */

public abstract class FlavourText {

    private static SecureRandom rand = new SecureRandom();
    private static int numberOfDestructiveVerbs = 100;
    private static int numberOfNouns = 100;
    private static int numberOfConstructiveVerbs = 100;
    private static int lastConstructiveVerbNumber = numberOfConstructiveVerbs;
    private static int lastDestructiveVerbNumber = numberOfDestructiveVerbs;
    private static int lastNounNumber = numberOfNouns;

    /**
     * This is a constant for Constructive Verbs
     */
    public static final Boolean CONSTRUCTIVE = true;
    /**
     * This is a constant for Destructive Verbs
     */
    public static final Boolean DESTRUCTIVE = false;

    // The "ing"s are added by the goofy string builder

    /**
     * This Constructor does nothing
     */

    FlavourText() {

    }

    private static final String constructiveVerbs[] = {
            "Align",
            "Build",
            "Calibrat",
            "Instanc",
            "Configur",
            "Snort",
            "Microwav",
            "Tweak",
            "Wrangl",
            "Hack",

            "Pwn",
            "Boot",
            "Allocat",
            "Bind",
            "Revv",
            "Polish",
            "Fabricat",
            "Ping",
            "Refactor",
            "Load",

            "Quantify",
            "Assembl",
            "Distill",
            "Bak",
            "Receiv",
            "Unlock",
            "Compil",
            "Pressuriz",
            "Chooch",
            "Mak",

            "Engag",
            "Decrypt",
            "Synthesiz",
            "Predict",
            "Analyz",
            "Dispens",
            "Fir",
            "Insert",
            "Align",
            "Encourag",

            "Extrud",
            "Access",
            "Sharpen",
            "Enhanc",
            "Crank",
            "Stack",
            "Craft",
            "Render",
            "Mount",
            "Generat",

            "Implement",
            "Download",
            "Construct",
            "Wow! Amaz",
            "Moisten",
            "Customiz",
            "Compensat",
            "Buffer",
            "Transferr",
            "Induct",

            "Emitt",
            "Unzipp",
            "Squirt",
            "Feed",
            "Buy",
            "Spark",
            "Implant",
            "Triangulat",
            "Inject",
            "Link",
            "Brew",

            "Process",
            "Deploy",
            "Tun",
            "Attach",
            "Train",
            "Ignor",
            "Tapp",
            "Reload",
            "Simulat",
            "Fluff",

            "Fill",
            "Sort",
            "Updat",
            "Upgrad",
            "Prim",
            "Trac",
            "Inflat",
            "Wangjangl",
            "Charg",
            "Crack",

            "Ignor",
            "Activat",
            "Dial",
            "Pimp",
            "Collect",
            "Approach",
            "Approv",
            "Sampl",
            "Energiz",
            "Stuff"
    };

    private static final String destructiveVerbs[] = {
            "Deallocat",
            "Trash",
            "Unplugg",
            "Revok",
            "Forgett",
            "Discard",
            "Dropp",
            "Holster",
            "Shredd",
            "Jettison",

            "Dissolv",
            "Liquidat",
            "Releas",
            "Collimat",
            "Eject",
            "Ditch",
            "Leak",
            "Sell",
            "Banish",
            "Dereferenc",

            "Sacrific",
            "Desolder",
            "Destruct",
            "Decompil",
            "Blow",
            "Disengag",
            "Digest",
            "Smash",
            "Encrypt",
            "Crash",

            "Lock",
            "Purg",
            "Regrett",
            "Rewind",
            "Free",
            "Delet",
            "Clos",
            "Retract",
            "Collaps",
            "Liquefy",

            "Derezz",
            "Stow",
            "Archiv",
            "Suspend",
            "Suppress",
            "Clean",
            "Squash",
            "Secur",
            "Withdraw",
            "Dump",

            "Obfuscat",
            "Break",
            "Scrubb",
            "Abandon",
            "Flatten",
            "Stash",
            "Finish",
            "Evacuat",
            "Scrambl",
            "Recycl",

            "Crush",
            "Zipp",
            "Unload",
            "Disconnect",
            "Loosen",
            "Contain",
            "Debat",
            "Detach",
            "Neutraliz",
            "Salvag",

            "Empty",
            "Hid",
            "Disarm",
            "Pickl",
            "Disregard",
            "Yeet",
            "Scrapp",
            "Deflat",
            "Discharg",
            "Deactivat",

            "Steriliz",
            "Reliev",
            "Nuk",
            "Degauss",
            "Dismiss",
            "Drain",
            "Reject",
            "Nerf",
            "Pay",
            "Return",

            "Unstick",
            "Splitt",
            "Cancell",
            "Sham",
            "Embezzl",
            "Fling",
            "Regrett",
            "Halt",
            "Arrest",
            "Bury"
    };

    private static final String nouns[] = {
            "content",
            "your mom",
            "the shmoo",
            "API",
            "the BJT man",
            "aesthetics",
            "backstory",
            "tactics",
            "bugs",
            "sauce",

            "warp drive",
            "data",
            "the funk",
            "AI",
            "crystals",
            "spaghetti",
            "fluxgate",
            "electrons",
            "loud noises",
            "wires",

            "bytecode",
            "the truth",
            "magic",
            "hot lava",
            "bits",
            "Brad",
            "Teensy",
            "sensors",
            "photons",
            "signal",

            "the planet",
            "password",
            "chips",
            "circuits",
            "privacy",
            "synergy",
            "widgets",
            "love",
            "packets",
            "reality",

            "lasers",
            "protocols",
            "voltage",
            "registers",
            "puns",
            "dogecoins",
            "kittens",
            "magic smoke",
            "plot device",
            "the core",

            "dank memes",
            "subroutines",
            "radiation",
            "steam",
            "trousers",
            "beer",
            "protocol",
            "one-liners",
            "the Gibson",
            "software",

            "a fat one",
            "holograms",
            "magnets",
            "inductors",
            "resistors",
            "capacitors",
            "viewers",
            "subscribers",
            "sausage",
            "my wife",

            "drama",
            "the future",
            "vectors",
            "the clowns",
            "a Palm Pilot",
            "5G implant",
            "monkeys",
            "breadboard",
            "Patreon",
            "money",

            "the Internet",
            "fluids",
            "the impostor",
            "beats",
            "dopamine",
            "fedora",
            "neural net",
            "comments",
            "ports",
            "you. Yes you",

            "mixtape",
            "[REDACTED]",
            "hot tub",
            "paperwork",
            "Nerf",
            "cyber-doobie",
            "the 1%",
            "the Matrix",
            "variables",
            "IP address"
    };

    /**
     * This method is used to generate random loading texts and
     * returns them as strings
     * 
     * @return String - Returns a Random loading text that is either Construtive or
     *         Destructive
     */
    public static String getLine() {
        return getLine(rand.nextBoolean());
    }

    /**
     * This method is used to generate random loading texts and
     * returns them as strings
     * 
     * @param constructive
     *                     Boolean to specify wether to generate Constructive or
     *                     Destructive loading text
     * @return String - Returns a Random loading text that is either Construtive or
     *         Destructive
     */
    public static String getLine(Boolean constructive) {

        lastConstructiveVerbNumber = numberOfConstructiveVerbs;
        lastDestructiveVerbNumber = numberOfDestructiveVerbs;
        lastNounNumber = numberOfNouns;

        int verbNumber = rand.nextInt(constructive ? numberOfConstructiveVerbs : numberOfDestructiveVerbs);
        int verbLength = constructive ? constructiveVerbs[verbNumber].length() : destructiveVerbs[verbNumber].length();
        int nounNumber = rand.nextInt(numberOfNouns);
        int nounLength = nouns[nounNumber].length();

        while ((constructive ? verbNumber == lastConstructiveVerbNumber : verbNumber == lastDestructiveVerbNumber)
                || nounNumber == lastNounNumber || verbLength + nounLength > 16) {
            verbNumber = rand.nextInt(constructive ? numberOfConstructiveVerbs : numberOfDestructiveVerbs);
            verbLength = constructive ? constructiveVerbs[verbNumber].length() : destructiveVerbs[verbNumber].length();
            nounNumber = rand.nextInt(numberOfNouns);
            nounLength = nouns[nounNumber].length();
        }

        String output = constructive ? constructiveVerbs[verbNumber] : destructiveVerbs[verbNumber];
        output += "ing ";
        output += nouns[nounNumber] + "...";

        if (constructive)
            lastConstructiveVerbNumber = verbNumber;

        else
            lastDestructiveVerbNumber = verbNumber;
        lastNounNumber = nounNumber;

        return output;

    }

}
