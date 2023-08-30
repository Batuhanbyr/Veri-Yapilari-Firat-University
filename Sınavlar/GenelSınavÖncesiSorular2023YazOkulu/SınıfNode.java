package GenelSınavÖncesiSorular2023YazOkulu;

public class SınıfNode {
String rol; // öğrenci mi, öğretmen mi
String isim; // öğrenci ya da hocanın ismi
String gerekenler; // yapması & bilmesi gerekenler
SınıfNode next;
public SınıfNode(String rol, String isim, String gerekenler) {
	this.rol = rol;
	this.isim = isim;
	this.gerekenler = gerekenler;
	this.next = null;
}

}
