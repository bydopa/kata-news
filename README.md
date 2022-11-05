Kata News
================

# Iteracion 1
- Se debe ver cada noticia en una lista (se puede usar el tab de eventos como inspiracion 
- ref: zpl://screen?pid=58e2b013c78758c36bcd781d&sid=5e73948f7d49e1bb51da4be3)
- Cada noticia tiene que mostrar solamente el titulo (sin la parte del reloj) y en lugar de mostrar rewards debe mostrar la categoria
- Al presionar una new debe navegar a la descripcion de la misma
- En la descripcion deben verse todos sus campos ordenados de una forma user friendly
- Se debe poder volver atras

# Iteracion 2
- Motstrar la imagen de la noticia tanto en la descripcion como en el "tab de eventos"
- En caso de no tener imagen se debe mostrar una por defecto
- Se debe poder filtrar por categoria
- Se debe ver un loading

# Iteracion 3
- Debo tener una nueva seccion donde ver noticias guardadas (solo de forma local)
- Debo poder guardar una noticia
- Debo ver animaciones de transicion y al realizar acciones (como de guardado, back y otras)
- Debo poder ver una noticia por deeplink (el deeplink generarlo como se prefiera)

##CATEGORIAS DE NOTICIA:
Business.
Cars.
Entertainment.
Family.
Health.
Politics.
Religion.
Science.

##NEWS ENDPOINT:
GET: https://kata-news.free.beeceptor.com/news

##CONSIDERACIONES:
Usar recycler view y navigation
Utilizar retrofit para la pegada a endpoint y Gson para su deserializacion
Usar glide para dibujado de imagenes remotas (cuidado con los tamaños de las imagenes)
Usar viewModels
Utilizar buenas practicas y tdd
Considerar la performance
Todo el codigo debe subirse a gitlab. Realizando commits chicos