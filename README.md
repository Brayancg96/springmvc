<section>
  <h1>📚 Proyecto de Estudio: Introducción a MVC, DTO, Request, Thymeleaf y API REST</h1>

  <p>
    Este proyecto es una guía práctica para comprender la arquitectura <strong>MVC</strong> en aplicaciones Java con Spring Boot,
    el uso de <strong>clases DTO</strong>, acceso al <strong>objeto de petición</strong> desde <code>HttpServletRequest</code>,
    plantillas con <strong>Thymeleaf</strong>, construcción de una <strong>API REST</strong> y varias anotaciones clave
    como <code>@ModelAttribute</code>, <code>@RequestParam</code>, <code>@PathVariable</code> y <code>@Value</code>. 
    También se estudio pruebas con <strong>Postman</strong> y el comportamiento de las URLs en el navegador cuando se renderizan vistas con Thymeleaf.
  </p>

  <hr />

  <h2>🎯 Objetivos de aprendizaje</h2>
  <ul>
    <li>Comprender el flujo MVC: <em>Controller → Service → Repository → View</em>.</li>
    <li>Diferenciar entidades del dominio y <strong>DTOs</strong> para transporte de datos.</li>
    <li>Manejar el <code>HttpServletRequest</code> para leer headers, parámetros y atributos.</li>
    <li>Crear endpoints REST (GET/POST) y probarlos con <strong>Postman</strong>.</li>
    <li>Renderizar vistas con <strong>Thymeleaf</strong> y enlazar datos con modelos.</li>
    <li>Usar anotaciones de Spring para vincular datos y configurar propiedades.</li>
  </ul>

  <h2>🧱 Arquitectura y Estructura</h2>
  <pre><code>src/
 └─ main/
    ├─ java/com/miapp/
    │  ├─ controller/       # Controladores MVC y REST
    │  ├─ dto/              # Data Transfer Objects (DTO)
    │  └─ config/           # Configuración y properties
    └─ resources/
       ├─ templates/        # Vistas Thymeleaf (.html)
       ├─ static/           # Recursos estáticos (css, js, img)
       └─ application.yml   # Propiedades (usadas con @Value)
</code></pre>

  <h2>📦 ¿Qué es un DTO?</h2>
  <p>
    Un <strong>DTO (Data Transfer Object)</strong> es una clase usada para transportar datos entre capas (por ejemplo,
    Controller ⇄ Service) sin exponer la entidad de dominio ni sus detalles internos.
  </p>

  <h3>Ejemplo de DTO</h3>
  <pre><code class="language-java">package com.miapp.dto;

public class UsuarioDTO {
  private Long id;
  private String nombre;
  private String email;

  // getters/setters/constructores
}
</code></pre>

  <h2>🔗 Resumen de anotaciones utilizadas</h2>
  <ul>
    <li><code>@Controller</code> / <code>@RestController</code>: Controladores para vistas y API.</li>
    <li><code>@RequestMapping</code>, <code>@GetMapping</code>, <code>@PostMapping</code>, <code>@PutMapping</code>, <code>@DeleteMapping</code>: Definición de rutas.</li>
    <li><code>@ModelAttribute</code>: Inyecta datos comunes al modelo de vistas.</li>
    <li><code>@RequestParam</code>: Lee parámetros de consulta (query string).</li>
    <li><code>@PathVariable</code>: Lee variables de la ruta.</li>
    <li><code>@Value</code>: Inyecta propiedades de configuración.</li>
    <li><code>@RequestBody</code>: Mapea JSON del cuerpo a objetos (DTO).</li>
  </ul>

  <h2>📝 Notas</h2>
  <ul>
    <li>Este proyecto es con fines educativos; no incluye seguridad ni persistencia avanzada.</li>
    <li>Se recomienda agregar validaciones (<code>@Valid</code>), manejo de errores global y tests.</li>
  </ul>

  <hr />
  <p><em>Si este proyecto te ayudó, ¡no olvides dejar una ⭐ en el repositorio!</em></p>
</section>
