public class Day8 {

	public static String difference(String a, String b) {
		for (int i = 0; i < b.length(); i++) {
			a = a.replaceAll(b.substring(i, i + 1), "");
		}
		return a;
	}

	public static String[] bubbleSort(String[] inputs) {
		String[] output = new String[inputs.length];
		boolean sorted = true;
		int k = 0;
		for (String eachInput : inputs) {
			String eachOutput = "";
			char[] input = eachInput.toCharArray();
			do {
				sorted = true;
				for (int i = 0; i < input.length - 1; i++) {
					char current = input[i];
					char next = input[i + 1];
					if (current > next) {
						input[i] = next;
						input[i + 1] = current;
						sorted = false;
					}
				}
			} while (!sorted);
			for (char current : input) {
				eachOutput += current;
			}
			output[k] = eachOutput;
			k++;
		}
		return output;
	}

	public static void main(String[] args) {

		String initialData = "fcdeba edcbag decab adcefg acdfb gdcfb acf fabe fa eacfgbd | aefb cfa acf cdabf\r\n"
				+ "adbec fabeg fgda gafedb fadeb cdebgf cfaebdg fd bdf cgfbae | ebdfga fbd bdagcef dfb\r\n"
				+ "cagefd fegabc gbde fcagebd bcedf gefcd bec cefbdg dfabc eb | gdeb dgbe defcb ebc\r\n"
				+ "cegbf acfeb cafde ab abfecd ecagfd edbcga adbf ecfadgb abc | degafc gefbc ab adcef\r\n"
				+ "bc gdeca bec fcab cegfdb edbgcfa gbefda fedba dceba badecf | fdbeacg dgbaef bec cbe\r\n"
				+ "caebdg gfc gaceb adcbf bgfac gf eafg dfbegc abfcge ebdcgaf | bcfag bdgface fegcba gdbeca\r\n"
				+ "fedga fgebdc dfb edcagb edcab afbc fdecba dbaef fb aefbgcd | bf bcade bf cafb\r\n"
				+ "cb cfgea badcge gdfabce bec fedbg egdafb cgdfbe cdfb cbgef | dbfc gecbfd fbdc ceb\r\n"
				+ "cbfdag fcbgd afbgced cgfab ebfgad agcbef dfg fecdb dcga gd | gacfedb cbfgd dgf gdfbc\r\n"
				+ "abgfd dgcbe dfbgce acbged eab ae daebg edac gdbfcae cgbeaf | bcedg eba eab edac\r\n"
				+ "gea ag cfaeg agcd befagd fcdae adcgfe ecbgafd cdbfea gefbc | bdeafc defacg gae dgcaef\r\n"
				+ "bfeca adfbce febd beagc cdeafg fgacedb efc dcbagf abcdf fe | agedfc cefba ef fgcbeda\r\n"
				+ "cbeafd gfabd dabecg cfeg dfc gcadf cgaed efacgdb cf gfcdae | cefg fgdca decagfb ebfadc\r\n"
				+ "fg edabf gbedf gedbfa ebafcg egbdacf fgad cedgb cdebfa egf | bgdec egdfab gf acfgbe\r\n"
				+ "cfe bacge ecfabd dcbfega defa cdfba defbcg fe feabc dbfcag | cabge ef fadbc eafd\r\n"
				+ "ag gadb edacfb gcaefd eafbd dbeafg efcgdba fag egcbf gfbea | agf gbfcdea cbaefd ag\r\n"
				+ "adegb gbdfe bcdafge gdfbce fcgeab geafbd ga dgfa age ecadb | ag gae gfda eag\r\n"
				+ "beagdfc faedc caegbf fgeba caefg cg ceg dbgfae aebgcd cfgb | ceg bgefca egc gce\r\n"
				+ "dcaf cd cdeabf cefab fgbde efbdc bcd eadcgb gebcadf caegbf | eacfgb cd feacb eafdcbg\r\n"
				+ "begadcf dbf ecdbg aedfc fbae cdfbga dcbaef bf deacfg cfbde | feba eafb bf cdfbe\r\n"
				+ "fbgced gcedba gbc fgadc gafcdbe cebf egfbd dbafge cdfgb cb | gcb begfd dfbaecg dbgfc\r\n"
				+ "dbcega beg gb cfdeba gaceb gfeca gdab fcedbg beacd cfagedb | cfbgade bg bg fdgcbe\r\n"
				+ "abdcgf agebc dacbg fbadce fcaged gd fdcebga cfdab gbdf dag | gd cefgdba dgbf fbdg\r\n"
				+ "gb ecbadf gbad edfgcb bgf dbcaf afbcg cgfea cdfgbae dcfbag | gb bg bgfceda dafcbe\r\n"
				+ "gaefd cg adbfce bdfecg fcbdgea cbafe agefc cgf abcegf gabc | gcf acedfb febgca cafbdeg\r\n"
				+ "deacgfb bfeacg ebgcdf dc cfadgb abegd gbcfe bcgde gdc dfec | gcd begad befcg dgc\r\n"
				+ "cdge dfebga gcbef abdcfe ec gebcdf cbe cedabfg fgdeb bfgca | ebgdfca ce fedbgca fdaecb\r\n"
				+ "bfde aeb aebfcgd gabdfc dgafb bfage be dfgeab fcega gdaceb | edbgac eab eba gaefc\r\n"
				+ "dcgae afebcg eabcgdf bg agb febda dcbg eagcdb abged edfcga | egcad cgdb deagb gb\r\n"
				+ "fdceag dbgca beg cegaf begcfa baef eb abgce adgebfc fbgdec | be eb afeb eb\r\n"
				+ "beadgc gdcf ebacf acdefg bfgdeca afcge dafgeb gf fga daegc | cdgf fg aecfb cbfea\r\n"
				+ "gfca gfdcabe ecg gc abecdf fbcea fagceb ebfdg efcbg dabegc | dfgbe gdebf cefbag ecafb\r\n"
				+ "feadg gbfdea acdefb gaebf cfged ad beagfcd dae ecagbf bagd | ad cgabfe cfdaeb dbga\r\n"
				+ "bcdge adcfeb cadbge bgdafe dbg gcedf acbg ebacd gb dcgeabf | abcgdef ebgcda bdgec bdcaeg\r\n"
				+ "cfga gacde fdgea cgefbd fgaedc cbadfge gc edbac gebdfa dgc | gcd cgaf eagfdb eagdf\r\n"
				+ "bg fdcega bgf dbgfcea gdcfe gbcaef bfged dbcg cdbgfe dfbae | gcbd ecfdg fbgde bfg\r\n"
				+ "gcdabf bgafe dbe eafbdc ecagfdb bedaf gadebc cdfe fdcab ed | dbfea gabdcef de gbdeca\r\n"
				+ "bcdaf gacfd deacgf bd gbdc adb aecfb gfcbad fdagbe edgcfab | eagbdf bgcd afbdge dab\r\n"
				+ "gface cbea cfegad bfa ab fdgbc acbgf ebdfga dbcafge cebfga | eagbdcf dacegbf ab ceab\r\n"
				+ "eabdf bcgafe gfedbac agcdbe gedcb abecd gcad ac bac cedbfg | deacb cab bdcfge dcfgaeb\r\n"
				+ "cedgf cbgdef gcafde fdae ebgfac edagc cae ea bdefagc bcdag | defcg gebdcf aec bgdac\r\n"
				+ "cdbae edf afbegd fgdebc aegfcb aebdgfc febcg dcfg df ecdfb | debagf df fcgd eadfgb\r\n"
				+ "adc fedcbga ad adgb ecagdb dcebg cgead dfgbec eafgc afcdbe | cda bgda ebdafc egbcfd\r\n"
				+ "cdfeb eafcdg acfde bdac edb gcfeb eagdbf db afdecb ebacgfd | abcd abcd db gbefc\r\n"
				+ "cdefa bf dcbag cdabf bcefgda ebcadg debfga afb bfcg cgabdf | bf gcabd bdagfec gfcb\r\n"
				+ "ecb eabgdc cgaeb bcagfd gfedcb beacdgf aedc ec beafg dgacb | gcdfba fgcbead ce ce\r\n"
				+ "fcebg gcfdeb bdgaec bfdg facged cbg egdcf facbe bg badfgce | fdgb bfcge fgbd egbcfd\r\n"
				+ "ebfcg bd adgfce acgbdef fegdb fbd gdba gbeafd fbacde agfde | cfbge db gdacfbe abfgde\r\n"
				+ "bgefc gcde afgcbe dgcfeb eadcgbf dg fbdeg gafcdb bdg fbade | dcgabf bcfdga egcd gd\r\n"
				+ "fbgadc gcb fcbagde bgaef bc cbdf fcgade cagbf bgaced gfacd | bcg dcebga cdgfa bcdf\r\n"
				+ "cgebaf egdac aefbdc cbafg becag bfge eb adbfegc ebc bdagcf | be bec egdca cabdgf\r\n"
				+ "fgd afgdce dg dage decgfb fcdag bcafgde gfcae egcafb fabcd | fcbdaeg gfcdbe agde fgd\r\n"
				+ "cbfga abg dgbfea dbafegc fceagb ba cfgea bcea gbdfc fgdeca | bcea bafdceg egafc cbdgf\r\n"
				+ "ebgcda acfegb gbdc befdcag fceadg afdbe cegad ebdga ebg bg | dfebgac dfeab gb gb\r\n"
				+ "bacdf cgdfae abc ecdaf agefcb ebdc dfbag cb cgfbdae daefcb | bc gcdafeb bca gcfeda\r\n"
				+ "fegabd egbfa gfa debag decfagb becfa cgadbf defg fg bgdeca | gfde agdcfb bgdcaf bafeg\r\n"
				+ "gf cbeafgd gedbaf cbfdeg egcfb cfbae gef cfgd egdcb gbdeca | gf fg gef dagcbe\r\n"
				+ "bac agcbd ba edcga gdfbce abfd egfbca fbgcd bacgdf becadgf | cfbeagd bdfa adbcg badf\r\n"
				+ "gd cdgeb aecfgb egcabd dcbagf ceagb ebcfd adge dgb gfbdcea | ebfdc deag ebfcga fabcgd\r\n"
				+ "dcbae agec dacebfg ebdag beacgd afcbd ced decfbg ec dfgeba | gdebcaf dbaegf ce aceg\r\n"
				+ "dagefb fbecgda adgec afcgde gacf bcdef fa efa cfead geadbc | dfebc bafcdge efa aef\r\n"
				+ "gbdae cgad bfcde ac dceabg bdgefa bfcaedg cab debca acgefb | ebacdgf abcgedf cab cefdgab\r\n"
				+ "dbegf adegbc gefdba acbgfd ebfcg gfbad deb edfa ed agedbfc | bfdgcae debgaf bdcgeaf gebcf\r\n"
				+ "fcgeb dagebc acfeg aecdfbg gedbaf bcgefd dfbeg bc bfcd cgb | cb efbgd cbg bc\r\n"
				+ "dba gcdbfe egabdc aedbfc fbced bgacf cfbdeag ad faed cbafd | cbfad ad ad cbfga\r\n"
				+ "edbcag ea ade cfbed fcdag gdaefc eafg faecd fdceagb gfbdca | bgadcef ae eafg ea\r\n"
				+ "eafbd gfbeda bc dacb fcbega bedcf debfacg edgfc cebafd ceb | dgbecaf gcedf bdca cgabfe\r\n"
				+ "bacegf deca gefbad adebcg gbcae gbacedf dgcbe ed cgdbf edb | bde ebd efadbg ceda\r\n"
				+ "dca acdfe bfegac fbeadcg deab dcgfe da acdbgf fbeca edcabf | deacbf dca cdbfage dac\r\n"
				+ "febg ecfdab abe deagf efgdba gcabd fdegca eb egfacbd dgaeb | cfedga abcefd efagdc bea\r\n"
				+ "fed feadc ef aecbdf gadbce cgdaf gdcaefb dbgefa bfce debca | dafec cdaeb fbec ef\r\n"
				+ "fecbdg cefdb gcbe cabdfe cdbgf gb cebafgd agfdc dbg dafgeb | ecbg cgfad cgdaf agdfc\r\n"
				+ "feacg cgfeda fbcagd fcbge cfa baegdc acegd gfadebc eafd fa | begfc fa afc dbagcf\r\n"
				+ "afgcbe cfg cf cfde cgfbd gbdfeca gbedac debgc egcfbd gfdab | cf cgfebd cfg fbegcad\r\n"
				+ "adecfgb bgdcea cbegaf efcbad ebg ge bdeac bcdeg fbcdg dega | dbcgf agde bfcega bge\r\n"
				+ "cg cbag dcg gdcfae dbfgcea dagefb cgabfd fbgda dgbcf fecbd | gdafeb dgc gc dgfabce\r\n"
				+ "cdfea dfbcg ga gac eafg adefcg acfdbeg gadfc cfedba edgbac | eafg cag bfgcd cdbgf\r\n"
				+ "dbaefcg cfdea eadgf dcba cfbaed befcd ace ca abgecf cfdebg | gbdface cegfdb edagf ecdbf\r\n"
				+ "dcf fcagd gcbf edbgcfa cf baegfd ecgad fedabc gfadb dcagfb | bgfc acgde cf fgbacd\r\n"
				+ "bg fedgc bfcega dbaegc gfacebd decbg gdba bcafed bedca cbg | dcefg bg bg bg\r\n"
				+ "geadcf ecfbd bagedc afcdb gcfde cefgdba bce begf be fdcebg | fgeb fegb cgedf ebc\r\n"
				+ "gbdcaf acgfed gc dafcb cag fbgea cbfga cbfdea bgdc dcfegab | bcgd aedgfc gfeba cg\r\n"
				+ "efdga afe ea gacbdf gbafd ageb dfaceb aedbfg dgfec bagfcde | fegdc dagfe ea egba\r\n"
				+ "bfg gf edabg fecbag abfgdec gacf acbfe bdecfg facbde fbega | fgaebc befcda fg abfge\r\n"
				+ "fceadg beacf cgbdae bgfd cedbf ecfdbag fgdceb edf bdecg df | cfabedg fed dfe gdbf\r\n"
				+ "fdeac dgfaeb dgfb gfadceb ceabdg gcebaf bf baf daefb aegdb | bdfg gdeab dbgacfe acfed\r\n"
				+ "ge cbfeda eag fagde fedab ceagdbf fbge ebcagd dcfga dagefb | cdfga ebfcda cadgbfe dfcag\r\n"
				+ "egcbadf ce afdgc cdefa abedf ecfdab efc bdegfa begafc ecbd | bcafde ecf ce ecf\r\n"
				+ "ebc gdacbfe gcefdb abefd dgec ec fbgdc fcadgb fdceb gfaceb | cged fadbceg ce bec\r\n"
				+ "ace egbdac acdef cafbgd efgdc cfabd ea feab bdaefc ebdfgac | adebcg cfbad ea dcfaebg\r\n"
				+ "fc bagcfed fdabg acefgb bcf bcgead egbca dfgceb fabgc acef | cfb beadgc begca fc\r\n"
				+ "cdefa agfecd fbcaed bgdeac gaefc ag eag cgbfe gafd cgbadef | gadf age ag gecbf\r\n"
				+ "dfgcea dgac egabdfc cfdbae edcgf fegbd cge cegbaf cg adfce | cbdaef gec cfedg cagd\r\n"
				+ "gcdfb dcbfa bcfgae gdbfe gfabed bafcdge cg cbg decg bfcgde | cg dabegf gc gecd\r\n"
				+ "bf dcefb fbe edagfb gefcd ebcad cbaf dcfeba ecagbd edbgcfa | bfeadc baefdg efdgc cfab\r\n"
				+ "debga ebgafd gcdafb cd cgd decabg ceagd egbfdca bcde aefgc | cd acbdgf ebcd cbde\r\n"
				+ "dfbaegc fgcae bgcead gfaedb cdefgb adfge fd degab def fbda | fcdgbe gbcaed dcegab febcdg\r\n"
				+ "gde gabcde afcbeg dg ebdaf degbfca cfgd bdegcf fgceb fdgbe | fgedbc dbagec gde eadbfgc\r\n"
				+ "aebdcgf bd ebdag agceb fegad gdeafb gdb fbed cgbfda cgefda | db fbaecdg eadbg befd\r\n"
				+ "cebdf bgecda efbdacg af aecfgd adf aegdbf abdef ebadg gfab | bdegaf gafb fbegad abdecgf\r\n"
				+ "adcb daf afdgce fgdbca gfbdc da bfadg dfebgc gbafe fdacbge | febga dfa dcafeg gafcdb\r\n"
				+ "bgacf dabg ebadcfg bfgdca ceadbf fecgd db dcb egfcab gfcdb | cabegf cdb cdfge cbd\r\n"
				+ "bg bedfc bedafc cebdfg fedgcba beg gdbcae adefg dgfbe gcbf | edbcaf fgbc egb cgbf\r\n"
				+ "abegd ecfbga cadfbg gbdecf adbgcfe ac gabec faec ebfcg abc | ceaf dgbecf bdgcfa efca\r\n"
				+ "degba begdaf gbdcea ecgd gceadfb bgadfc ecdba bfeca cd dbc | cadgbef gbdea dgec cdge\r\n"
				+ "ceabgd fcbge cdeba cdf fgecdab fd afcgdb dbcfea dbefc afed | dcebf df fd df\r\n"
				+ "ebd fgbdc cfbe bgdcef fegad be befdg acbgdef cegdab agcdfb | bed gfedb cefb fgbcd\r\n"
				+ "deb gbcd ecfbgd cfedga ecbdf db edcgf afbdge cefba eabcgfd | bde bd cfeba gfadce\r\n"
				+ "afbec bcefd afgec cfaegd fgbace ba deagbf abe bcag dafebcg | cefba fgaedc fbgaed bfced\r\n"
				+ "fabed cadfbeg ecf afedc gfdac agec facgdb ec cdefga dfgcbe | agbdcef efc dbfeagc agdfc\r\n"
				+ "gc baedg gaebdc edbfga dabfc dbagc gdec gbc dcfegba cfabeg | agdeb eabdg dbagc gdfabec\r\n"
				+ "dfegab fgd gadc agfdcb gd cfdbg bcagf edbcf fcgeadb aefcgb | cfabg dgac dg gd\r\n"
				+ "cagfbde dcbfge bgefd ebdfag af caedb daf eabdf bfgacd egfa | ebcad adegbf dcaeb edgfbac\r\n"
				+ "fecd gbadf baecdg ebfacg fbedcag ef gdafec egdaf gecda afe | fe fe efdc defcabg\r\n"
				+ "fgbdac egbca gecfda fgadc gfb befgda bcafg dcbaegf bdfc bf | bf fb egcab caefgd\r\n"
				+ "fb efcdag gebcd faedg dagfeb cfgadb cfgbdae bfae fdb degbf | gbdef afbe gecbfad adgef\r\n"
				+ "gdcf abegdcf dg dga cdefba bgcae afegdb deafc eafcdg dcega | cegab eacbg dga gedac\r\n"
				+ "caegfb gfcad ebcdfg cbdfega gdcbf bf cbf edgcb bdfe gedacb | dgcaf gcdfb bfed edbcafg\r\n"
				+ "bdcfe fgdbaec ecgafd befgad eafbd adf gabd fbgae ad gfcaeb | bgda ad ad fcedag\r\n"
				+ "agecfd bcegfa fbecgad fgcad gefdc fcdegb fbgad cga aedc ac | cdfag cegdf gdceaf cdbgfe\r\n"
				+ "bgd befgd fdbceag db dcgfe cbde dfgcba gafecd dcbgfe gfabe | cdbe egdcbf egfcd dbcegf\r\n"
				+ "ed gdefc dcegfb fecbg fcdag edg bacedg edbf becafg adecfgb | ed ed gbfcae bgfdce\r\n"
				+ "fbdagc gabdf ecdabfg caegbd ebgaf cfabde cgfd agd gd dbafc | fbdcae dfcaegb gad gabfe\r\n"
				+ "fbeacg fbcaged fdaeg fde becfgd agfbe de eabd abedgf acfdg | ed dgebafc agefbd fgdac\r\n"
				+ "deagf efcad dga dfgeca dcaebf gecd dg faebdgc agefb bdgcaf | dg gbeaf fcbdgea gd\r\n"
				+ "fb gaedcfb gebda gabdec dagbfe fbdae aecdf fbd gcebdf gbfa | afecbdg bdecga abged bdecgfa\r\n"
				+ "gb bgedcfa adgefc dbgef deafg eabdgf ecdfb acgbde afgb ebg | gb afgb cefgbda gb\r\n"
				+ "gb edacfgb cdfegb bgc cgaefd bdga fbeac gacfd fgdacb bacgf | gdacf gdba abdg bfcga\r\n"
				+ "ce befcag ebdca adgcb aec dgebaf bdefca badfe edcf bfegacd | cbfaed begcfa abegdcf cfde\r\n"
				+ "ceabdg bceafdg gabfed caef ac aegfb bafcg bfaceg cdbfg cga | ac aedfgb gfecba ca\r\n"
				+ "gdebf aecf bcgfda fcd gcebda fbcde ecbad gebfdac cfaebd cf | cdf dcbage cf befdg\r\n"
				+ "fdga df fdbage bdeaf adegb agedcb fbd fbcea dbfgec cfbegad | fd bfdgcea aecgbd agedb\r\n"
				+ "cbegda agcbfd gbeafdc dacge fgbec bd edfacg bead gdb dgbce | bdg acgde daeb gbafcd\r\n"
				+ "degcbf fg acgedb cdgbfea adgf bfg eagbd fgbae becfa geadfb | dgaf febag gdeba gdbcea\r\n"
				+ "fcgaeb aebdg gcadeb cegfdb afdeg ebcfgda dgb cdba bd bcage | agedf eagcb dcgaeb cgfbae\r\n"
				+ "gbecd abedc fegbcd efgacd fegdab bg bgcdafe geb fdceg gbcf | beg bdgeaf gdfec efgcda\r\n"
				+ "acbfe cef egfabd afbeg bdfeacg cage gfdcbe ec beagfc facbd | cef fce afebdcg acefb\r\n"
				+ "da afd gfebdc cadg deafc ecfdg gdafbec fagcde edbafg eabfc | aefbdg ad fcdge dgbfce\r\n"
				+ "ecgdaf df dbeac fbegc cdf bfedc bacgde dfaecb dbfa bfgdace | defcag bcfed fedcb begcf\r\n"
				+ "ceafbd ecfgbad afgdbe gbdac fcgbed ebg eg gfae egadb baedf | ge eg gafedb bge\r\n"
				+ "bf abcdfe afb acdbf fdaebg cdgabe cbfe cdbea dgaefcb gfcad | cagedbf acefdbg febadgc edbac\r\n"
				+ "aegcdf abgecf abefdgc daefg agbfd eacgd cgeadb decf fe gfe | fe gcafedb fe bdcgea\r\n"
				+ "be cgfdea bfce fbegd bagefdc bge gbfda fedgc ecdabg bdefgc | begdf dgaefbc bge edbcfg\r\n"
				+ "facebgd fcge caf agbecf dbafg aegcb dcabeg bagfc fc fcadeb | cf caf fc ecafbg\r\n"
				+ "fbegca bfegad cafe caegb beagf gfcdab ca cdegb bfdegca cag | fgaeb agc ecfa bfaeg\r\n"
				+ "ab fceadgb bae gceda afbced gfdeb edbafg fdbecg aebgd bfga | ba ebfdca gfedb dagbe\r\n"
				+ "abdfcg egcf efd efgacdb fe ebacd dbcfeg gbfaed bdcfg cdbef | cadfgb gfce def geabfdc\r\n"
				+ "beafdc bgdec efgbac gab gdbcaf ebcga gfea ga cagebfd fcabe | gba cbega gaef eabcfdg\r\n"
				+ "de fdcegb fcebd afegbc efd bdcfa decgbaf gfecb gefdac dbge | gedb edf gbfec ed\r\n"
				+ "dbfacge eabdg beg adbcg eg abdfe fbadeg adcbef bfecdg gaef | bedfga bdfae dafcbe beg\r\n"
				+ "acfbg bfgdea eabcf fagbced gcfd cgabfd gf cadbge fbg acgbd | gfdc bcgfeda acbgf dcagb\r\n"
				+ "cdeba gfdbce cad acbf gedba ecabdgf cfadeb egadfc ca cdbef | defbgc cdbef caedb acebd\r\n"
				+ "edfabg ab cfegdb adgcebf eacb dcafb ebdcf efbdac adfgc abd | efbdag abec cfbad ab\r\n"
				+ "abgdcf fdg fg edfabc dabfegc gfac bdcaf egdcb gcbfd fdaebg | dfbgeca fg bfdgac cgdefab\r\n"
				+ "gcdafb ce cbde fecgd acgebdf gcbfd aefdg gbfdce gcfeab cef | bced dacgfb dbgecfa decb\r\n"
				+ "gaecfdb cge dacef cg bgead gcead fbecag cbeafd dfgc fdaegc | dfcg gc agced dfcg\r\n"
				+ "eb cegfab gdbe ecagfd dafcb decagbf fbe abefd gfead eafdgb | gbafed fgeda abfde be\r\n"
				+ "gebadf ebfdg bgefdc bdea bafcedg feagc adbfcg befag ba bga | gacebfd geadfb acfgbd bade\r\n"
				+ "becda dgaeb dg dcefab gbd cgfdba cabged gfabe egdc gafedbc | gabef dgb fcdabg dceg\r\n"
				+ "aebf bfc bfecg bf febcgad egbafc fgedc eacgbd dafbcg ebacg | aefb gfbaec bf fb\r\n"
				+ "cdgaeb bdacefg afecgd edaf cagfe ae gbcfa cae bgcfde fgecd | cfdage abdgfce defa cagfb\r\n"
				+ "bedag gdcbea gfebdca adg dgfbac dg faegcb eafdb egdc acegb | dg efgadcb gdce bcegad\r\n"
				+ "dacfgbe fg fbace fbgae gef cefbad debga gefbcd ebcgfa gfca | cafg decbfg efg gf\r\n"
				+ "deca cbaefd fdgebca fca bfdga gbdcfe ac fcbeag dcfeb badcf | adcfb dfcbgae gecbaf eabcdf\r\n"
				+ "gdabefc ca gbefda aec cafg ebafc gcdeba gefba ecbdf feabcg | cfga fgaebd dcbgae bfage\r\n"
				+ "ecd fagedc dcaegb efgd febdcga fcade efcgab fgcea afdbc de | gbceda de gefbca efdg\r\n"
				+ "afgcb ecbdgfa bdgecf ad dgea cadfg afd afecbd cedagf fecgd | beafdc afd geda adgfec\r\n"
				+ "gbdcfe cdeab fd fecda adcgebf adebgc badf egcaf dfc fbdeac | cgafe fbdeca beagfcd caebfgd\r\n"
				+ "abgfc gfedabc cb dcefga bdca fcb egbcfd dbgafc dafcg gabfe | acefgd bcf dbgfac acgdf\r\n"
				+ "facge ecadgb fecdba dfcg fc fac eagfcd bgecfda afgeb eacdg | cdfg caefg fc bdeafcg\r\n"
				+ "efdgb cebadg ceafbg fadcbg bcafdge fag af efgba cabeg faec | abgce ceaf gaf gbdeac\r\n"
				+ "cafegb gcadfb begfacd bfad db dbgfc dbc cgfde bgcdea cbfga | gbfadc edabcg agfbec dbfa\r\n"
				+ "facb acbefdg baedfg fbegca gfeadc bae dgcbe geacf ab gcaeb | ba eba baegdfc ba\r\n"
				+ "edfgba gbfed dfc afdcebg cd cbdef fbaec gedcbf gcdb dgefca | gfbade cbdg dfc cbgd\r\n"
				+ "bfc fgcbda dgfecb dbegac gcaf afcbd dcbfeag dagbc adbef fc | afcg afgc fcb gbedfc\r\n"
				+ "dfagb edagbfc dceb agebcf bc gaedfc fbc cfbaed fcdba adecf | bc cb ecdfba bdec\r\n"
				+ "gc cgdfbe agcb bfgdcea egacfb gefdba dcfea fcg fgeac aebgf | fbgdec cbafge gbac befga\r\n"
				+ "fgdac agfbed ec bcegfd eadgbc gdcae gdaeb abec ceg bcdgfae | fgcad dagce adfcg ec\r\n"
				+ "gfcad aecbgdf feacgd ceda fgdae fca ac bagedf acfegb cfbdg | acf afc fac ac\r\n"
				+ "agcdeb ga aebdgf bedfgc age feadg cadfe egdbfca efgdb gfba | edbgac fdeca acedbg cgbdfe\r\n"
				+ "gfdc acebf dce adgcbe egcdaf aedgfbc gfdae afgbed aedcf cd | gadcef dc fdecag aegfdb\r\n"
				+ "agcdeb gdfc gebdc bcaegf cf dabef cfdegb ecbfd aecfdbg fbc | fbc debfc gecabfd gedcb\r\n"
				+ "aebfc aecgf cb daegcf dbaecg cbdgafe adfeb bce bfgc bgcaef | ceb fbgc cbgf bdcefag\r\n"
				+ "egfdab cefbgad cbfdea gdea egbdf bed de gbefc gbfad gbfacd | eacdgbf agbfdc dgcaefb de\r\n"
				+ "adbfce be afcebgd fadbc bed dfaeb badcfg acdebg eafdg cbfe | edb cbfe fdgeacb deb\r\n"
				+ "bad feab cfdga fcgdbe dcfbe gedacb cadbf becfagd dbeafc ab | efcbgda aebf bdcgafe abef\r\n"
				+ "dbfeg dfbecag dace cfdbag gcabd cegdb egafcb ec ceb debcga | bce ce adbecgf abgcd\r\n"
				+ "cabdgf dea abcgd abfdeg acdbge befdgac edacg fegdc abce ea | edacg gedcf dceag bagdfc\r\n"
				+ "aceg ac bacgfd ceabf fcaegb edbgfc dbfea bgecdaf ebgfc acf | agce ac ecbfa agfbecd\r\n"
				+ "bgcfda egc dbefcag befdg ec aedc cadfeg cgdaf gefcd fcageb | cebdagf dace ecfdag bcdaegf\r\n"
				+ "bfdgc gbe acgef gbcade be egfcb afbe bacfeg dfbgeac gcfaed | abfe gfcbd fbgeac dcgbf\r\n"
				+ "efcbd adegbcf agefdb cdabf bedgca abgdf dgabfc ac fcga bac | ac abc debgac fbdgac\r\n"
				+ "ebgacd fd bdface cabdf dfa gfcab gbeafdc ecfd ecbda egfdba | fd df dcef fd\r\n"
				+ "cbadge geb cfdge bg bfeca bgecaf edcabf gcbfe afgb efgdabc | fabg gabf gfbec afebc\r\n"
				+ "fedgabc cbedg fcaegd ecg dcfgb ce bdfgae gaebd cbea ecdbag | efcbagd bfeagcd ce ce\r\n"
				+ "gebdcf cdbfga fead aedfcgb ad afegbd gdfbe bedag ecagb agd | ad bfcagd ceafdgb fcgadbe\r\n"
				+ "fdegb egdbfc cegfdab dacfge dge gadbf edcfb edcabf egcb ge | edg bagdcfe egcb ged\r\n"
				+ "ad cfbeag adb efbad feabc acfd cgdeba fdacgbe dgefb feadbc | fabce cfbega defbca bad\r\n"
				+ "facbge cfabd bgcafde agdb fab becdf cfaegd dafgc agfcbd ba | cbfda ab cbfdaeg dfagbc\r\n"
				+ "eg dgaebc dfcgab cdgfe edfcb adcgf cedagf geaf bacdefg gde | dfcbe eagf agdecf ge";

		int count = 0;
		int totalDigitsOutput = 0;
		for (String line : initialData.split("\r\n")) {
			String[] parts = line.split(" \\| ");
			String[] inputs = parts[0].split(" ");
			String[] outputs = parts[1].split(" ");


			// Part 1: find how many times the digits 1, 4, 7, and 8 appear in the outputs.
			for (String output : outputs) {
				switch (output.length()) {
				case 2:
				case 3:
				case 4:
				case 7:
					count++;
				}
			}

			// Part 2: find total sum of all digit outputs.
			int digitOutput = 0;
			// Sort each input and output value.
			inputs = bubbleSort(inputs);
			outputs = bubbleSort(outputs);
			System.out.println(String.join(" ", inputs) + " | " + String.join(" ", outputs));

			// Char's to hold which position is which character
			char first = Character.MIN_VALUE; // ......1st.---
			char second = Character.MIN_VALUE; // ....2nd.|...| 3rd
			char third = Character.MIN_VALUE; // .........|...|
			char fourth = Character.MIN_VALUE; // .....4th.---
			char fifth = Character.MIN_VALUE; // .....5th.|...| 6th
			char sixth = Character.MIN_VALUE; // .........|...|
			char seventh = Character.MIN_VALUE; // ....7th.---

			//Arrays to hold 5 length and 6 length digits
			String[] fiveLetters = new String[3];
			String[] sixLetters = new String[3];

			String zero = "";
			String one = "";
			String two = "";
			String three = "";
			String four = "";
			String five = "";
			String six = "";
			String seven = "";
			String eight = "abcdefg";
			String nine = "";
			int l = 0;
			int m = 0;
			for (String input : inputs) {
				// Assign the four easy digits their correct character sequences.
				if (input.length() == 2) {
					one = input;
				} else if (input.length() == 3) {
					seven = input;
				} else if (input.length() == 4) {
					four = input;
				} else if (input.length() == 5) {
					fiveLetters[l] = input;
					l++;
				} else if (input.length() == 6) {
					sixLetters[m] = input;
					m++;
				}
			}
			//Figure out the values
			first = difference(seven, one).charAt(0);
			for (String str : sixLetters) {
				String dif = difference(str, one);
				if (dif.length() == 5) {
					six = str;
					third = difference(one, str).charAt(0);
					sixth = difference(one, difference(one, str)).charAt(0);
					break;
				}
			}
			for (String str : sixLetters) {
				String dif = difference(str, four);
				if (dif.length() == 3 && str != six) {
					zero = str;
					fourth =  difference(eight, str).charAt(0);
				} else if (dif.length() == 2 ) {
					nine = str;
				}
			}
			fifth = difference(zero, nine).charAt(0);
			seventh = difference(difference(nine, seven), four).charAt(0);
			second = difference(difference(four, one), "" + fourth).charAt(0);

			two = "" + first + third + fourth + fifth + seventh;
			three = "" + first + third + fourth + sixth + seventh;
			five = "" + first + second + fourth + sixth + seventh;
			String[] left = new String[] {two, three, five};
			left = bubbleSort(left);
			two = left[0];
			three = left[1];
			five = left[2];

			//Now I know what all corresponding sets of characters are.
			String digit = "";
			for (String output : outputs) {
				if (output.equals(zero)) {
					digit += '0';
				} else if (output.equals(one)) {
					digit += '1';
				} else if (output.equals(two)) {
					digit += '2';
				} else if (output.equals(three)) {
					digit += '3';
				} else if (output.equals(four)) {
					digit += '4';
				} else if (output.equals(five)) {
					digit += '5';
				} else if (output.equals(six)) {
					digit += '6';
				} else if (output.equals(seven)) {
					digit += '7';
				} else if (output.equals(eight)) {
					digit += '8';
				} else if (output.equals(nine)) {
					digit += '9';
				}
			}

			int output = Integer.parseInt(digit,0, 4, 10);
			totalDigitsOutput += output;
		}

		System.out.println("\nPart 1 count: " + count);
		System.out.println("Part 2: Total sum of all digit outputs: " + totalDigitsOutput);
	}
}
