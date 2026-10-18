package corona.jesus.cartelera

data class Pelicula(
    val id: Int,
    val titulo: String,
    val anio: Int,
    val duracionMin: Int,
    val genero: String,
    val director: String,
    val sinopsis: String,
    val imagen: Int
)

val peliculas = listOf(
    Pelicula(
        id = 1,
        titulo = "Toy Story",
        anio = 1995,
        duracionMin = 81,
        genero = "Animación",
        director = "John Lasseter",
        sinopsis = "Woody, el juguete favorito de Andy, siente amenazado su lugar cuando llega Buzz Lightyear, un guardián espacial que no sabe que es un juguete.",
        imagen = R.drawable.toy_story
    ),
    Pelicula(
        id = 2,
        titulo = "Coco",
        anio = 2017,
        duracionMin = 105,
        genero = "Animación",
        director = "Lee Unkrich",
        sinopsis = "Miguel, un joven aspirante a músico, se enfrenta a la ancestral prohibición de la música en su familia y entra a la Tierra de los Muertos para encontrar a su tatarabuelo.",
        imagen = R.drawable.coco
    ),
    Pelicula(
        id = 3,
        titulo = "Volver al futuro",
        anio = 1985,
        duracionMin = 116,
        genero = "Ciencia ficción",
        director = "Robert Zemeckis",
        sinopsis = "Marty McFly, un estudiante de secundaria de 17 años, es enviado accidentalmente treinta años al pasado en un DeLorean que viaja en el tiempo, inventado por su amigo científico Doc Brown.",
        imagen = R.drawable.volver_al_futuro
    ),
    Pelicula(
        id = 4,
        titulo = "Jurassic Park",
        anio = 1993,
        duracionMin = 127,
        genero = "Aventura",
        director = "Steven Spielberg",
        sinopsis = "Un pragmático paleontólogo que visita un parque temático casi completo se ve obligado a proteger a dos niños tras un fallo de seguridad que provoca la fuga de los dinosaurios clonados del parque.",
        imagen = R.drawable.jurassic_park
    ),
    Pelicula(
        id = 5,
        titulo = "El viaje de Chihiro",
        anio = 2001,
        duracionMin = 125,
        genero = "Animación / Fantasía",
        director = "Hayao Miyazaki",
        sinopsis = "Durante la mudanza de su familia a los suburbios, una niña de 10 años vaga por un mundo gobernado por dioses, brujas y espíritus, y donde los humanos se convierten en bestias.",
        imagen = R.drawable.el_viaje_de_chihiro
    ),
    Pelicula(
        id = 6,
        titulo = "Interestelar",
        anio = 2014,
        duracionMin = 169,
        genero = "Ciencia ficción",
        director = "Christopher Nolan",
        sinopsis = "Un equipo de exploradores viaja a través de un agujero de gusano en el espacio en un intento por garantizar la supervivencia de la humanidad.",
        imagen = R.drawable.interestelar
    )
)
