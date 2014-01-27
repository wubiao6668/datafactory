package org.paragon.datafactory.data.impl;

import org.paragon.datafactory.data.Names;

public class NLNamesImpl implements Names {

	private static String[] lastNames = {
			"Jong", "Jansen", "Vries", "Berg", "Dijk", "Bakker", "Janssen", "Visser", "Smit", "Meijer", "Boer",
			"Mulder", "Groot", "Bos", "Vos", "Peters", "Hendriks", "Leeuwen", "Dekker", "Brouwer", "Wit", "Dijkstra",
			"Smits", "Graaf", "Meer", "Kok", "Jacobs", "Linden", "Haan", "Vermeulen", "Heuvel", "Veen", "Broek",
			"Bruin", "Schouten", "Bruijn", "Beek", "Heijden", "Willems", "Vliet", "Hoekstra", "Maas", "Verhoeven",
			"Koster", "Dam", "Prins", "Blom", "Huisman", "Peeters", "Jonge", "Kuipers", "Wal", "Veen", "Post",
			"Kuiper", "Veenstra", "Kramer", "Brink", "Scholten", "Wijk", "Postma", "Martens", "Vink", "Ruiter",
			"Timmermans", "Groen", "Ven", "Gerritsen", "Jonker", "Loon", "Boer", "Willemsen", "Smeets", "Lange",
			"Bosch", "Vos", "Dongen", "Schipper", "Koning", "Koning", "Laan", "Driessen", "Doorn", "Hermans", "Evers",
			"Velden", "Bosch", "Meulen", "Hofman", "Bosman", "Wolters", "Sanders", "Mol", "Horst", "Kuijpers",
			"Molenaar", "Leeuw", "Verbeek", "Stam", "Kroon", "Groot", "Timmer", "Rooij", "Wouters", "Groeneveld",
			"Roos", "Haas", "Schaap", "Rijn", "Bosma", "Pronk", "Koopman", "Vonk", "Verhagen", "Snijders", "Dekkers",
			"Es", "Zijlstra", "Velde", "Versteeg", "Boon", "Klein", "Stevens", "Simons", "Gerrits", "Aarts", "Otten",
			"Muller", "Verweij", "Bouwman", "Schaik", "Blok", "Jager", "Klaassen", "Jager", "Rutten", "Damen", "Eijk",
			"Heide", "Cornelissen", "Rooij", "Vermeer", "Geurts", "Bouman", "Franken", "Teunissen", "Faber", "Lammers",
			"Boersma", "Arts", "Roelofs", "Buijs", "Os", "Joosten", "Venema", "Verhoef", "Thijssen", "Derksen",
			"Schuurman", "Visscher", "Derks", "Goossens", "Akker", "Wiersma", "Kersten", "Timmerman", "Werf", "Baas",
			"Baars", "Brouwers", "Essen", "Lieshout", "Kamphuis", "Plas", "Driel", "Wessels", "Rooijen", "Hoek",
			"Rossum", "Zwart", "Eck", "Gils", "Bouma", "Arends", "Ploeg", "Steen", "Bos", "Vissers", "Bijl", "Hartman",
			"Knol", "Tromp", "Dalen", "Terpstra", "Ruijter", "Hoogendoorn", "Rietveld", "Hartog", "Berkel", "Kooistra",
			"Feenstra", "Boonstra", "Pol", "Schut", "Boer", "Pieters", "Koopmans", "Keizer", "Konings", "Stolk",
			"Zanten", "Ridder", "Smulders", "Veldman", "Schepers", "Vugt", "Brink", "Boers", "Molen", "Vis", "Waal",
			"Jongh", "Zee", "Nieuwenhuis", "Albers", "Brand", "Brinkman", "Klomp", "Duijn", "Keijzer", "Velzen",
			"Sluis", "Veer", "Egmond", "Schreurs", "Kooijman", "Hoof", "Verheijen", "Lamers", "Kool", "Nijenhuis",
			"Heemskerk", "Heijnen", "Willemse", "Nijland", "Brands", "Reinders", "Leenders", "Visser", "Berends",
			"Meijers", "Kok", "Bergsma", "Gelder", "Veldhuis", "Ruiter", "Schippers", "Drost", "Theunissen",
			"Swinkels", "Wijnen", "Schutte", "Verschoor", "Linde", "Hoogeveen", "Wagenaar", "Hoeven", "Wilde", "Kooij",
			"Fransen", "Manders", "Klaver", "Mulders", "Jonkers", "Kessel", "Putten", "Steenbergen", "Graaff",
			"Nijhuis", "Bongers", "Kempen", "Bouwmeester", "Pol", "Franssen", "Burg", "Lemmens", "Geerts", "Ouden",
			"Koops", "Mourik", "Yilmaz", "Winter", "Ginkel", "Beckers", "Wijngaarden", "Veerman", "Versluis",
			"Schreuder", "Bruinsma", "Bergen", "Hendriksen", "Drenth", "Laat", "Woude", "Groenendijk", "Schoenmakers",
			"Verheij", "Houben", "Valk", "Kampen", "Swart", "Boom", "Boot", "Houten", "Wetering", "Borst", "Coenen",
			"Laar", "Lubbers", "Timmers", "Kamp", "Nguyen", "Westra", "Weijers", "Oomen", "Kroes", "Meij", "Beer",
			"Burger", "Ven", "Hees", "Poel", "Berendsen", "Hiemstra", "Bruins", "Laar", "Alphen", "Erp", "Kolk",
			"Scheffer", "Blaauw", "Lee", "Keulen", "Bergh", "Schijndel", "Hoek", "Moonen", "Raaijmakers", "Jaspers",
			"Esch", "Engels", "Harmsen", "Dam", "Pol", "Vogel", "Schellekens", "Waard", "Burgers", "Dijk", "Hoogland",
			"Beekman", "Dijkman", "Verkerk", "Boxtel", "Hoek", "Pelt", "Zonneveld", "Veldhuizen", "Tol", "Rijswijk",
			"Oosten", "Elzinga", "Snijder", "Janssens", "Snel", "Huizinga", "Staal", "Hagen", "Hurk", "Heijmans",
			"Janse", "Pot", "Roest", "Koot", "Tilburg", "Vliet", "Voort", "Koelewijn", "Douma", "Soest", "Meijden",
			"Nijhof", "Smith", "Wolf", "Tol", "Kerkhof", "Kloosterman", "Kusters", "Bartels", "Mierlo", "Schenk",
			"Klerk", "Engelen", "Hal", "Stoop", "Donkers", "Man", "Brugman", "Kort", "Berkhout", "Vogels", "Klok",
			"Snoek", "Hermsen", "Smid", "Alberts", "Westerhof", "Troost", "Engelen", "Hollander", "Witteveen",
			"Jonkman", "Veen", "Wiel", "Zuidema", "Koolen", "Scholte", "Pennings", "Weide", "Boogaard", "Bijlsma",
			"Horst", "Schmidt", "Zwaan", "Slot", "Gestel", "Bie", "Kremer", "Kamp", "Cox", "Aa", "Akkerman", "Ros",
			"Delft", "Donker", "Hamers", "Schilder", "Reitsma", "Weerd", "Meijerink", "Kooten", "Hartog", "Wijnands",
			"Reijnders", "Sande", "Mertens", "Zeeuw", "Hollander", "Buis", "Santen", "Hendrikx", "Linders", "Bruin",
			"Kuijper", "Moes", "Claassen", "Miedema", "Schie", "Uden", "Heer", "Valk", "Goedhart", "Boom", "Hol",
			"Schuurmans", "Haar", "Nijboer", "Graaf", "Mensink", "Polman", "Witte", "Bax", "Deursen", "Stegeman",
			"Coolen", "Spaans", "Buitenhuis", "Ingen", "Buuren", "Wever", "Hout", "Weber", "Gent", "Schmitz", "Velde",
			"Verburg", "Hulshof", "Ooms", "Zwan", "Spek", "Verheul", "Geus", "Oorschot", "Bol", "Beek", "Lierop",
			"Veltman", "Krijgsman", "Have", "Schrijver", "Beers", "Beumer", "Ham", "Zanden", "Cremers", "Nijman",
			"Vegt", "Haan", "Nijssen", "Kaya", "Verstappen", "Braam", "Vrolijk", "Bruggen", "Maanen", "Ali", "Hendrix",
			"Wassink", "Martina", "Oudshoorn", "Pater", "Gool", "Laan", "Dooren", "Krol", "Werff", "Ooijen", "Riel",
			"Oosterhout", "Bal", "Romijn", "Verschuren", "Bloem", "Rademaker", "Veldkamp", "Zon", "Oever", "Haren",
			"Mohamed", "Gemert", "Jans", "Helden", "Gielen", "Klijn", "Kroeze", "Kleef", "Ahmed", "Heiden", "Habets",
			"Hof", "Nijkamp", "Zwiers", "Hof", "Lam", "Gorter", "Kanters", "Noort", "Bekkers", "Bergman", "Scheepers",
			"Bommel", "Dijkhuizen", "Putten", "Bleeker", "Pijnenburg", "Griffioen", "Krijnen", "Broeders", "Goede",
			"Ham", "Hofstede", "Roos", "Roo", "Kooij", "Zwart", "Nijs", "Mooij", "Aalst", "Laarhoven", "Nauta",
			"Winter", "Broekhuizen", "Tijssen", "Oort", "Bekker", "Rovers", "Hoogenboom", "Schot", "Wanrooij", "Koenen",
			"Winters", "Hopman", "Tongeren", "Prinsen", "Bouwhuis", "Graaf", "Luijten", "Maassen", "Haaren", "Bogers",
			"Wolf", "Yildiz", "Iersel", "Ras", "Broers", "Nelissen", "Hoorn", "Bron", "Verbruggen", "Spijker",
			"Landman", "Maat", "Galen", "Kessels", "Aken", "Wolfs", "Akkermans", "Heeren", "Oosting", "Verstegen",
			"Ommen", "Diepen", "Pieterse", "Sterk", "Rijk", "Rozema", "Groenewegen", "Verboom", "Baan", "Jongsma",
			"Nieuwenhuizen", "Oerlemans", "Zandbergen", "Zegers", "Schonewille", "Sluijs", "Poot", "Hemert", "Kleijn",
			"Pool", "Oers", "Beek", "Linssen", "Vervoort", "Altena", "Cuijpers", "Vaessen", "Slagter", "Brand", "Hulst",
			"Hoving", "Aerts", "Beijer", "Son", "Dorp", "Wong", "Helm", "Spierings", "Geffen", "Adema", "Bree",
			"Dijken", "Thomassen", "Yildirim", "Roelofsen", "Slingerland", "Oskam", "Singh", "Witte", "Hageman",
			"Brandsma", "Herk", "Koenders", "Blokland", "Bisschop", "Wind", "Kraan", "Geerlings", "Ligthart", "Lith",
			"Verberne", "Wieringa", "Klaveren", "Spaan", "Booij", "Scholtens", "Kingma", "Meester", "Wassenaar",
			"Kemper", "Rodenburg", "Aalders", "Kesteren", "Schoemaker", "Drunen", "Waal", "Dokter", "Rutgers",
			"Ouwehand", "Lier", "Harms", "Nijmeijer", "Engel", "Hofstra", "Koch", "Walraven", "Bruggeman", "Storm",
			"Lucas", "Zijl", "Pols", "Posthumus", "Hofland", "Gelderen", "Haan", "Claessens", "Lodder", "Öztürk",
			"Haak", "Gier", "Boven", "Wingerden", "Demir", "Thomas", "Knaap", "Hoek", "Ende", "Hassan", "Reijnen",
			"Straten", "Keijzer", "Zweers", "Hummel", "Jongen", "Klop", "Huizing", "Kuijk", "Burg", "Segers",
			"Kruithof", "Lent", "Cornelisse", "Hanssen", "Roovers", "Breugel", "Vossen", "Loenen", "Schimmel",
			"Westerveld", "Kolkman", "Oosterhof", "Şahin", "Dirks", "Osch", "Tan", "Oost", "Olthof", "Wielen", "Winkel",
			"Doornbos", "Bakel", "Hop", "Adams", "Hout", "Groeneweg", "Niemeijer", "Teeuwen", "Greef", "Geelen",
			"Vogelaar", "Woudstra", "Otto", "Strik", "Bont", "Voogt", "Homan", "Loo", "Nagtegaal", "Maessen", "Bezemer",
			"Boogaard", "Kerkhof", "Hoogendijk", "Bronkhorst", "Loos", "Aalbers", "Water", "Gerwen", "Bouw", "Asselt",
			"Wissink", "Hut", "Berge", "Ploeg", "Aydin", "Kouwenhoven", "Broekman", "Gorp", "Huijbregts", "Amerongen",
			"Warmerdam", "Bremer", "Wisse", "Toonen", "Gerven", "Leijten", "Dommelen", "Ewijk", "Hove", "Manen", "Reus",
			"Pouw", "Lucassen", "Bergmans", "Schoenmaker", "Langeveld", "Hoven", "Bijl", "Smolders", "Robben", "Burgt",
			"Dungen", "Jansma", "Kamps", "Berger", "Voortman", "Strien", "Geest", "Ottens", "Meurs", "Kruijf",
			"Kortekaas", "Wesselink", "Brons", "Kuijt", "Kranenburg", "Andel", "Spruijt", "Drent", "Hertog", "Meurs",
			"Otter", "Haverkamp", "Donders", "Koole", "Megens", "Groenewoud", "Weijden", "Bouwens", "Geel", "Struik",
			"Vermeij", "Schaaf", "Wel", "Cheung", "Hage", "Biemans", "Kort", "Gijsbers", "Middelkoop", "Moerman",
			"Veenendaal", "Hansen", "Overbeek", "Admiraal", "Mark", "Spoelstra", "Werkman", "Kooiman", "Grinsven",
			"Gubbels", "Kamp", "Koers", "Snippe", "Peek", "Hoekman", "Ouwerkerk", "Valkenburg", "Verdonk", "Coppens",
			"Mooij", "Jagt", "Nagel", "Plomp", "Deckers", "Reuvers", "Broere", "Ommeren", "Wesseling", "Stelt",
			"Özdemir", "Mostert", "Pijpers", "Vinke", "Wiggers", "Terlouw", "Wiel", "Duin", "Groenen", "Ramakers",
			"Veldhuizen", "Smink", "Wolff", "Postema", "Verhulst", "Bot", "Houtman", "Everts", "Rook", "Rijsdijk",
			"Roon", "Petersen", "Kock", "Scheffers", "Barten", "Dorst", "Sanden", "Claessen", "Tang", "Spruit",
			"Bussel", "Brouwer", "Rombouts", "Zutphen", "Oosterhuis", "Top", "Dijke", "Heinen", "Mil", "Besten", "Chen",
			"Ibrahim", "Meel", "Somers", "Müller", "Veld", "Verhoeff", "Hart", "Heijer", "Strijker", "Hamstra",
			"Benjamins", "Langenberg", "Hoog", "Schröder", "Korte", "Nap", "Pluijm", "Wevers", "Voets", "Schneider",
			"Govers", "Velthuis", "Verhaar", "Vogelzang", "Elzen", "Simon", "As", "Rijkers", "Koomen", "Zomer",
			"Beurden", "Barneveld", "Rensen", "Vuuren", "Hensen", "Nuijten", "Boelens", "Knoop", "Kelder", "Struijk",
			"Hoogen", "Bus", "Vaart", "Los", "Regt", "Oud", "Berg", "Verduijn", "Kunst", "Buren", "Spee", "Boots",
			"Wouda", "Beelen", "Giesen", "Kooi", "Koetsier", "Marsman", "Sijtsma", "Brakel", "Hilhorst", "Brekelmans",
			"Hoogervorst", "Ende", "Feijen", "Gorissen", "Balk", "Buurman", "Dijck", "Biggelaar", "Wijers", "Hoop"
	};

	@Override
	public String[] getLastNames() {
		return lastNames;
	}

	private static String[] prefixes = {
			"aan", "aan de", "aan den", "aan der", "aan het", "aan 't", "an",
			"bij", "bij de", "bij den", "bij het", "bij 't",
			"boven d'", "de", "den", "der", "d'", "des",
			"het", "'t",
			"in", "in de", "in den", "in der", "in het", "in 't",
			"onder", "onder de", "onder den", "onder het", "onder 't",
			"op", "op de", "op den", "op der", "op het", "op 't", "op ten",
			"over", "over de", "over den", "over het", "over 't", "'s",
			"te", "ten", "ter", "to", "toe", "tot",
			"uit", "uit de", "uit den", "uit het", "uit 't", "uit ten",
			"uijt", "uijt de", "uijt den", "uijt het", "uijt 't", "uijt ten",
			"van", "van de", "van den", "van der", "van het", "van 't", "van ter", "ver",
			"voor", "voor de", "voor den", "voor in 't"
	};

	@Override
	public String[] getPrefixNames() {
		return prefixes;
	}

	private static String[] firstNamesFemale = {
			"Aartie", "Aartje", "Aaya", "Abbey", "Abby", "Abbygail", "Abida", "Abigail", "Abigaël", "Abigaïl", "Abir",
			"Abygail", "Acelya", "Ada", "Adaja", "Adela", "Adelheid", "Adelina", "Ai", "Aicha", "Aida", "Aike",
			"Aileen", "Aimee", "Aimy", "Aimée", "Ainhoa", "Aisa", "Aischa", "Aisha", "Aisling", "Aislinn", "Alessia",
			"Alet", "Aletta", "Alette", "Alev", "Alex", "Alexa", "Alexandra", "Alexia", "Alexis", "Aleyna", "Ali",
			"Alia", "Alycia", "Alysa", "Alysha", "Alyshia", "Alysia", "Alyssa", "Alyssia", "Amaal", "Amal", "Amalia",
			"Amanda", "Amani", "Amara", "Benedicte", "Benice", "Benita", "Bente", "Benthe", "Berbel", "Berber",
			"Berdien", "Berdina", "Berdine", "Berendina", "Birsen", "Birte", "Birthe", "Blanca", "Blanche", "Blessing",
			"Bloem", "Bloeme", "Bo", "Bobbi", "Bobbie", "Bobby", "Bodien", "Bodil", "Bodine", "Bojana", "Bojoura",
			"Bonita", "Bonne", "Bonnie", "Danischa", "Danisha", "Danita", "Danitia", "Danitsja", "Daniël", "Daniëla",
			"Daniëlla", "Daniëlle", "Danja", "Danjella", "Danne", "Danni", "Danniek", "Dannique", "Danny", "Dante",
			"Danya", "Dané", "Danée", "Daphna", "Daphne", "Daphny", "Dara", "Darcy", "Daria", "Indigo", "Indira",
			"Indra", "Indy", "Ine", "Ineke", "Ines", "Inez", "Inga", "Inge", "Ingeborg", "Jaantje", "Jacey", "Jacinta",
			"Jacintha", "Jackelien", "Jackie", "Jacklyn", "Jacky", "Jaclyn", "Jacoba", "Jacobien", "Jacobina",
			"Jacobine", "Jacobje", "Jacolien", "Jacoline", "Jacomijn", "Jacomijntje", "Jacomina", "Jacquelien",
			"Jülide", "Ka", "Kaat", "Kaatje", "Kader", "Kadija", "Kadriye", "Kady", "Kai", "Kailey", "Kaily", "Kaitlin",
			"Kaitlyn", "Kaja", "Kajal", "Kajol", "Kalina", "Kaltoum", "Kamila", "Kamile", "Kaoutar", "Kaouthar", "Kara",
			"Kardelen", "Karen", "Kari", "Mariëlle", "Mariët", "Mariëtta", "Mariëtte", "Marja", "Marjam", "Marjan",
			"Marjanne", "Marjella", "Marjelle", "Marjet", "Marjo", "Marjoke", "Marjolein", "Marjoleine", "Marjolijn",
			"Marjolijne", "Marjon", "Marjorie", "Marjory", "Marla", "Marle", "Marleen", "Marlein", "Marlena", "Marlene",
			"Marley", "Marli", "Marlie", "Marlieke", "Marlien", "Mira", "Miranda", "Miray", "Mireille", "Mirela",
			"Mirella", "Mirelle", "Miriam", "Mirian", "Mirja", "Mirjam", "Mirjan", "Mirjana", "Mirle", "Mirna", "Mirne",
			"Miron", "Mirre", "Mirte", "Mirthe", "Miryam", "Mirza", "Mischa", "Misha", "Misja", "Misty", "Philippine",
			"Philomena", "Phoebe", "Phuong", "Phylicia", "Phyllis", "Pia", "Pieke", "Pien", "Pieta", "Pieterdina",
			"Pieterke", "Pieternel", "Pieternella", "Pietertje", "Pietje", "Pietronella", "Pietsje", "Pilar", "Pim",
			"Pinar", "Pip", "Pippa", "Pippi", "Pleun", "Pleuni", "Pleunie", "Pleuntje", "Polly", "Pomme", "Pooja",
			"Riley", "Rim", "Rima", "Rimke", "Rina", "Rineke", "Rinke", "Rinske", "Rinskje", "Rishma", "Rita", "Riva",
			"Rivka", "Rixt", "Riëlle", "Riëtte", "Rkia", "Roan", "Roanne", "Robbin", "Roberta", "Robi", "Robin",
			"Robina", "Robine", "Roby", "Sigrid", "Siham", "Sija", "Sijgje", "Sijke", "Sijtje", "Sijtske", "Sil",
			"Sila", "Silja", "Silje", "Silke", "Silva", "Silvana", "Silver", "Silvia", "Silvie", "Silvy", "Sima",
			"Simge", "Simona", "Simone", "Simran", "Sin", "Sina", "Sindy", "Sinem", "Sinne", "Sinéad", "Siobhan",
			"Sippie", "Tanisha", "Tanita", "Tanja", "Tanne", "Tanneke", "Tannetje", "Tansu", "Tanya", "Tara", "Tarah",
			"Tasha", "Tatiana", "Tatjana", "Tatum", "Taylor", "Tea", "Teatske", "Ted", "Teddie", "Teddy", "Teodora",
			"Teresa", "Terra", "Terri", "Terry", "Tes", "Ümran", "Ilayda", "Ilknur", "Irem", "Sebnem", "Sefika",
			"Senay", "Serife", "Sevval", "Seyda", "Seyma", "Sirin", "Suheda", "Sule", "Süheda", "Sükran", "Šejla"
	};

	@Override
	public String[] getFirstNamesFemale() {
		return firstNamesFemale;
	}

	private static String[] firstNamesMale = {
			"Aad", "Aalbert", "Aaldert", "Aaldrik", "Aalt", "Aarnoud", "Aarnout", "Aaron", "Aart", "Aart-Jan", "Abbas",
			"Albert-Jan", "Alberto", "Albertus", "Albin", "Alco", "Aldert", "Aldin", "Aldo", "Ale", "Alec", "Alejandro",
			"Alek", "Aleksandar", "Aleksander", "Alem", "Alen", "Alessandro", "Alessio", "Alex", "Alexander",
			"Andro", "André", "Andréas", "Andy", "Ane", "Anel", "Anes", "Angel", "Angelino", "Angelo", "Angelos",
			"Angus", "Anh", "Aniel", "Anil", "Anis", "Anish", "Anjo", "Anko", "Anne", "Anne-Jan", "Anno", "Anouar",
			"Antonius", "Antony", "Antoon", "Antwan", "Anwar", "Anil", "Ara", "Aram", "Aran", "Aras", "Arash", "Arco",
			"Boudewijn", "Bouke", "Bouwe", "Bowe", "Bowen", "Bowie", "Bowy", "Boy", "Boyan", "Boyd", "Boye", "Boyke",
			"Breunis", "Brian", "Broer", "Brooklyn", "Daoud", "Darcy", "Dardan", "Darian", "Dario", "Darius", "Darko",
			"Darnell", "Daron", "Darrel", "Darrell", "Darren", "Dré", "Duane", "Duc", "Duco", "Duke", "Duko", "Duncan",
			"Duran", "Durk", "Durmus", "Durmus", "Dursun", "Dustin", "Dusty", "Duuk", "Duy", "Dušan", "Dwayn", "Dwayne",
			"Dwight", "Dyami", "Dyan", "Dylan", "Dylano", "Dyllan", "Dyon", "Déjan", "Délano", "Earl", "Ebe",
			"Ebenezer", "Ebrahim", "Ebu", "Ebubekir", "Ed", "Eddie", "Eddo", "Eddy", "Edgar", "Edin", "Edis", "Edison",
			"Ferri", "Ferrie", "Ferris", "Ferron", "Gies", "Gijs", "Gijsbert", "Gijsbertus", "Gijsbrecht", "Gilano",
			"Gilbert", "Gilberto", "Giliam", "Gilian", "Giliano", "Gillermo", "Gilles", "Gillian", "Gilliano", "Gillis",
			"Gilmar", "Gino", "Gio", "Giomar", "Giordano", "Giorgio", "Giovani", "Giovanni", "Giovannie", "Giovanny",
			"Gokhan", "Gommert", "Goof", "Gooitzen", "Goos", "Goossen", "Goran", "Gordon", "Gosse", "Ikram", "Ilan",
			"Jaydan", "Jaydee", "Jayden", "Jaydon", "Jaylen", "Jayme", "Jaymie", "Jayro", "Jayson", "Jazz", "Jazzley",
			"Jazzy", "Jaël", "Jaïr", "Jaïro", "Jean", "Jean-Luc", "Jean-Michel", "Jean-Paul", "Jean-Pierre", "Jeannot",
			"Jeen", "Jef", "Jeff", "Jefferson", "Jeffery", "Jeffrey", "Jeffry", "Jefrey", "Jefta", "Jeftha", "Jelani",
			"Jelco", "Jelger", "Jelke", "Jelle", "Jelmar", "Jelmer", "Jelt", "Jelte", "Jenairo", "Jenne", "Jenno",
			"Jurgen", "Juri", "Juriaan", "Jurian", "Jurick", "Jurie", "Juriën", "Jurjan", "Jurjen", "Jurn", "Jurre",
			"Jurren", "Lahcen", "Lahoucine", "Lamar", "Lambert", "Lambertus", "Lammert", "Lance", "Lando", "Lard",
			"Larry", "Lars", "Lasse", "Laszlo", "Latif", "Lauran", "Lauren", "Laurence", "Laurens", "Laurens-Jan",
			"Laurent", "Laurentius", "Laurenz", "Laurus", "Lawrence", "Lazar", "Lazlo", "Lean", "Leander", "Leandro",
			"Leco", "Lee", "Leen", "Leendert", "Leendert-Jan", "Leeroy", "Lei", "Lein", "Lemar", "Len", "Lenard",
			"Leonard", "Leonardo", "Leonardus", "Leonhard", "Leopold", "Leroy", "Marien", "Marijn", "Marik", "Marin",
			"Marino", "Marinus", "Mario", "Maris", "Marius", "Mark", "Mark-Jan", "Marko", "Markus", "Marley", "Marlin",
			"Marlo", "Marlon", "Marnick", "Marnik", "Marnix", "Maron", "Marouan", "Marouane", "Marshall", "Mart",
			"Marten", "Marthijn", "Marthijs", "Martien", "Martijn", "Martin", "Martino", "Martinus", "Marty", "Martyn",
			"Marvin", "Marwan", "Marwin", "Maryn", "Mas", "Mason", "Masoud", "Massimiliano", "Massimo", "Master",
			"Recep", "Reda", "Redmar", "Redmer", "Redouan", "Redouane", "Reduan", "Redwan", "Reece", "Reggie", "Reggy",
			"Regilio", "Regillio", "Reginald", "Reijer", "Reimer", "Rein", "Reinald", "Reinaldo", "Reinard",
			"Ricardus", "Riccardo", "Ricco", "Richano", "Richard", "Richardus", "Richel", "Richenel", "Richie",
			"Richmond", "Rick", "Rickey", "Ricky", "Rico", "Rida", "Ridge", "Ridouan", "Ridvan", "Ridwan", "Riekelt",
			"Rieks", "Riemer", "Rien", "Rienk", "Rients", "Ries", "Soner", "Sonny", "Souad", "Soufian", "Soufiane",
			"Soufyan", "Soufyane", "Souhail", "Soulaiman", "Soulaimane", "Soulaïman", "Spencer", "Spike", "Splinter",
			"Stacey", "Stach", "Stan", "Stanislav", "Stanley", "Steef", "Stef", "Stefan", "Stefano", "Stefanos",
			"Stephanus", "Stephen", "Stern", "Sterre", "Stevan", "Steve", "Steven", "Stevie", "Steyn", "Stian", "Stijn",
			"Stoffel", "Stoffer", "Storm", "Stuart", "Styn", "Stéphan", "Stéphane", "Suat", "Suleman", "Suleyman",
			"Sultan", "Sunil", "Tibbe", "Tibo", "Tibor", "Ticho", "Tico", "Tiddo", "Tido", "Tiede", "Tieme", "Tiemen",
			"Tiemo", "Ties", "Tigo", "Tijani", "Tije", "Tijl", "Tijm", "Tijme", "Tijmen", "Tijn", "Tijs", "Tim",
			"Timber", "Timen", "Timme", "Timmie", "Timmo", "Timmy", "Timo", "Timon", "Timoteus", "Timoteüs",
			"Timotheus", "Timotheüs", "Timothy", "Timothëus", "Timur", "Timótheüs", "Tin", "Tino", "Tinus", "Titus",
			"Tjerry", "Tjesse", "Tjeu", "Tjibbe", "Vinesh", "Vinnie", "Vinny", "Vinod", "Viresh", "Virgil", "Virgill",
			"Vishaal", "Vishal", "Vishnu", "Vito", "Vittorio", "Vladimir", "Volkan", "Volkert", "Vural", "Wael",
			"Wahid", "Wai", "Wail", "Waldo", "Walid", "Walt", "Walter", "Walterus", "Walther", "Waltherus", "Wan",
			"Wessel", "Wester", "Wiard", "Wibe", "Wichard", "Wicher", "Wichert", "Wick", "Wiebe", "Wiebren", "Wiecher",
			"Wieger", "Wiek", "Wierd", "Wiert", "Wietse", "Wietze", "Wolf", "Wolfgang", "Wolter", "Wopke", "Wout",
			"Wouter", "Wouter-Jan", "Wouterus", "Wubbo", "Wulfert", "Wybe", "Wybren", "Wynand", "Wytse", "Wytze", "Xam",
			"Xander", "Xandro", "Xavi", "Xavier", "Xian", "Xiao", "Xin", "Xu", "Xuan", "Yael", "Yahia", "Yahya",
			"Yanniek", "Yannik", "Yannis", "Yari", "Yarnick", "Yarno"
	};

	@Override
	public String[] getFirstNamesMale() {
		return firstNamesMale;
	}
}
