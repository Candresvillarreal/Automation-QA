# language: es

  Característica: Realizar compras de artículos
    Como un nuevo cliente
    Quiero ingresar en la página www.abc.com
    Para realizar una compra de un artículo

    @EscenarioSinEjemplos
  Escenario: Agregar artículos al carrito de compras
    Dado que un nuevo cliente accede hasta la web de compras
    Cuando el cliente agrega 3 unidades de  Mascarilla N95 de Belleza y salud al carrito de compras
    Entonces el cliente ve los productos listados en el carrito de compras

    @EscenarioConEjemplos
  Esquema del escenario: Agregar artículos al carrito de compras
    Dado que un nuevo cliente accede hasta la web de compras
    Cuando el cliente agrega productos al carrito de compras
      | <nombreProducto> | <cantidadAgregar> |
    Entonces el cliente ve los productos listados en el carrito de compras

    Ejemplos:
    | nombreProducto | cantidadAgregar |
    | Mascarilla N95 | 100             |