
---

# Pageable 

---

## English

### About

This project is a comprehensive reference implementation showcasing the advanced use of the Pageable interface in Spring Boot and Spring Data JPA. It is designed as a best-practice guide to demonstrate how to build scalable and high-performance REST APIs that handle server-side pagination, sorting, and dynamic filtering for large datasets.

### Features

- **Server-Side Pagination:** Efficiently fetches data in chunks from the database, preventing performance bottlenecks.
- **Dynamic Sorting:** Allows sorting by single or multiple fields in both ascending (ASC) and descending (DESC) order.
- **Dynamic Filtering with JPA Specification:** Implements flexible and complex queries using the Specification interface to filter results based on dynamic criteria.
- **Custom Pageable Response:** Returns a structured JSON response that includes not only the data list (content) but also pagination metadata like totalPages, totalElements, and currentPage.
- **DTO (Data Transfer Object) Pattern:** Uses DTOs to separate the persistence layer (Entity) from the API layer, ensuring a clean and secure data flow.
- **Request Validation:** Employs Spring Validation to validate incoming request parameters and bodies.

### Technologies

- **Language:** Java
- **Framework:** Spring Boot, Spring Data JPA
- **Database:** PostgreSQL
- **Build Tool:** Maven

### Usage

- **1.** Clone the project.
- **2.** Configure application.properties for your PostgreSQL database.
- **3.** Run the Spring Boot application.
- **4.** Use REST clients like Postman to test API endpoints.
- **5.** Errors and validation failures will return standardized JSON responses with detailed info.

### License

This project is licensed under the MIT License.

---

## Türkçe

### Hakkında

Bu proje, Spring Boot ve Spring Data JPA'da Pageable arayüzünün gelişmiş kullanımını gösteren kapsamlı bir referans projesidir. Büyük veri setleri için sunucu taraflı sayfalama (pagination), sıralama (sorting) ve dinamik filtreleme işlemlerini ele alan, ölçeklenebilir ve performanslı REST API'ler oluşturmak için en iyi uygulamaları sergilemeyi amaçlamaktadır.

### Özellikler

- **Sunucu Taraflı Sayfalama:** Veritabanından verileri parçalar halinde verimli bir şekilde çekerek performans sorunlarını önler.
- **Dinamik Sıralama:** Sonuçların tek veya çoklu alanlarda, artan (ASC) veya azalan (DESC) sırada sıralanmasına olanak tanır.
- **JPA Specification ile Dinamik Filtreleme:** Dinamik kriterlere göre sonuçları filtrelemek için Specification arayüzü kullanılarak karmaşık ve esnek sorgular oluşturulmuştur.
- **Özelleştirilmiş Sayfalama Cevabı (Response):** Yalnızca veri listesini (content) değil, aynı zamanda totalPages, totalElements ve currentPage gibi meta verileri de içeren yapılandırılmış bir JSON cevabı döner.
- **DTO (Data Transfer Object) Deseni:** Veritabanı katmanını (Entity) API katmanından ayırmak için DTO'lar kullanılarak temiz ve güvenli bir veri akışı sağlanır.
- **İstek (Request) Doğrulaması:** Gelen istek parametrelerini ve gövdelerini doğrulamak için Spring Validation kullanılır.

### Teknolojiler

- **Dil:** Java
- **Framework:** Spring Boot, Spring Data JPA
- **Veritabanı:** PostgreSQL
- **Proje Yönetimi:** Maven

### Kullanım

- **1.** Projeyi klonlayın.
- **2.** application.properties dosyasını PostgreSQL bağlantınıza göre düzenleyin.
- **3.** Spring Boot uygulamasını başlatın.
- **4.** Postman gibi REST istemcileriyle API endpoint’lerini test edin.
- **5.** Hata ve validasyon durumlarında detaylı ve standart JSON hata cevapları alacaksınız.

### Lisans

Bu proje MIT Lisansı ile lisanslanmıştır.

---