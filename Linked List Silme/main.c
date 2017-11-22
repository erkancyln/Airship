#include <stdio.h>
#include <stdlib.h>
struct dugum {
	int deger;
	struct dugum * sonraki;
};
void listeyi_yaz(struct dugum *baslangic)
{
	struct dugum *e;
	
	for(e=baslangic;e!=NULL;e=e->sonraki)
	{
		printf("%d ", e->deger);
	}
	printf("\n");
}
void basa_ekle(struct dugum **bas, struct dugum **son, int N) {
	struct dugum * yeni = malloc(sizeof(struct dugum));
	yeni->deger = N;

	if (*bas == NULL) {
		// listede eleman yoksa: ilk elemani ekleme islemini yapiyoruz
		yeni->sonraki = NULL;
		*bas = *son = yeni;
	} else {
		// listede eleman varsa: basa ekleme islemini yapiyoruz
// ilk eleman yapacagimiz icin sonraki eski ilk eleman
	yeni->sonraki = *bas;
	*bas = yeni; // bas isaretcisi artik yeni elemani gosteriyor
}
}
void sona_ekle(struct dugum **bas, struct dugum **son, int sayi) {
	struct dugum * yeni = malloc(sizeof(struct dugum));
	yeni->deger = sayi;

	if (*bas == NULL) {
		// listede eleman yoksa: ilk elemani ekleme islemini yapiyoruz
		yeni->sonraki = NULL;
		*bas = *son = yeni;
	} else {
		// listede eleman varsa: sona ekleme islemini yapiyoruz
		yeni->sonraki = NULL; // son eleman yapacagimiz icin sonraki NULL
		(*son)->sonraki = yeni; // son elemanin sonrasina ekliyoruz
		*son = yeni; // son isaretcisi artik yeni elemani gosteriyor
	}
}
int main() 
{
	struct dugum * bas = NULL;
	struct dugum * son = NULL;

	sona_ekle(&bas, &son, 111);
	sona_ekle(&bas, &son, 150);
	sona_ekle(&bas, &son, 200);
	sona_ekle(&bas, &son, 250);
	sona_ekle(&bas, &son, 300);

	son_elemani_sil(&bas, &son);
	listeyi_yaz(bas);

	son_elemani_sil(&bas, &son);
	listeyi_yaz(bas);

	son_elemani_sil(&bas, &son);
	listeyi_yaz(bas);

	son_elemani_sil(&bas, &son);
	listeyi_yaz(bas);

	son_elemani_sil(&bas, &son);
	listeyi_yaz(bas);
	return 0;
}
