export default class FlavourText {
    constructor() {
        this.numberOfDestructiveVerbs = 100;
        this.numberOfNouns = 100;
        this.numberOfConstructiveVerbs = 100;
        this.lastConstructiveVerbNumber = this.numberOfConstructiveVerbs;
        this.lastDestructiveVerbNumber = this.numberOfDestructiveVerbs;
        this.lastNounNumber = this.numberOfNouns;

        this.constructiveVerbs = [
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
        ];

        this.destructiveVerbs = [
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
        ];

        this.nouns = [
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
        ];
    }

    getLine(constructive) {
        let lastConstructiveVerbNumber = this.numberOfConstructiveVerbs;
        let lastDestructiveVerbNumber = this.numberOfDestructiveVerbs;
        let lastNounNumber = this.numberOfNouns;

        let verbNumber = Math.floor(Math.random() * (constructive ? this.numberOfConstructiveVerbs : this.numberOfDestructiveVerbs));
        let verb = constructive ? this.constructiveVerbs[verbNumber] : this.destructiveVerbs[verbNumber];
        let nounNumber = Math.floor(Math.random() * this.numberOfNouns);
        let noun = this.nouns[nounNumber];

        let verbLength = verb.length;
        let nounLength = noun.length;

        while ((verbNumber === lastConstructiveVerbNumber && constructive) || verbNumber === lastDestructiveVerbNumber || nounNumber === lastNounNumber || (verbLength + nounLength + 5) > 16) {
            verbNumber = Math.floor(Math.random() * (constructive ? this.numberOfConstructiveVerbs : this.numberOfDestructiveVerbs));
            verb = constructive ? this.constructiveVerbs[verbNumber] : this.destructiveVerbs[verbNumber];
            nounNumber = Math.floor(Math.random() * this.numberOfNouns);
            noun = this.nouns[nounNumber];

            verbLength = verb.length;
            nounLength = noun.length;
        }

        if (constructive) {
            lastConstructiveVerbNumber = verbNumber;
        } else {
            lastDestructiveVerbNumber = verbNumber;
        }
        lastNounNumber = nounNumber;

        return `${verb}ing ${noun}...`;
    }

    getRandomLine() {
        return this.getLine(Math.random() >= 0.5);
    }
}