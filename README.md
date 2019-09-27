# design-observer

El patrón de observador define una dependencia de uno a muchos entre los objetos, de modo que cuando un objeto cambia de estado, todos sus dependientes son notificados y actualizados automáticamente.

Piensa en un estación meteorológica. Puede tener un conjunto de clientes (es decir, aplicaciones web, aplicaciones móviles). Cada cliente debe saber cada vez que haya un cambio en el estado de la estación meteorológica; de lo contrario, los clientes no podrán mostrar resultados precisos en tiempo real. El patrón Observador es la solución para este tipo de situaciones.

Implementa una aplicación que permita simular una estación metereológica. En este escenario, la estación meteorológica se puede tomar como el Editor (Asunto) y cada cliente se puede tomar como un Suscriptor (Observador).
