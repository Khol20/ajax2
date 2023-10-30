function getListeVilles(elementId) {
    var villes = [
        'Agadir', 'Al Hoceima', 'Asilah', 'Azemmour', 'Azrou', 'Beni Mellal', 'Berkane',
        'Casablanca', 'Chefchaouen', 'El Jadida', 'Essaouira', 'Fes', 'Kenitra', 'Khemisset',
        'Khouribga', 'Larache', 'Marrakech', 'Meknes', 'Mohammedia', 'Nador', 'Ouarzazate',
        'Oujda', 'Rabat', 'Safi', 'Sale',"Settat", 'Tangier', 'Taroudant', 'Taza', 'Temara', 'Tetouan', 'Tiznit', 'Youssoufia',
    ];

    var selectElement = document.getElementById(elementId);

    if (selectElement) {
        for (var i = 0; i < villes.length; i++) {
            var option = document.createElement('option');
            option.value = villes[i];
            option.text = villes[i];
            selectElement.appendChild(option);
        }
    } else {
        console.error("The element with the specified ID was not found.");
    }
}







