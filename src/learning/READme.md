# Validasi input

| Anotasi                                   | Fungsi                                     | Contoh                                    |
| ----------------------------------------- | ------------------------------------------ | ----------------------------------------- |
| `@NotNull`                                | Tidak boleh null                           | `@NotNull private String name;`           |
| `@NotBlank`                               | Tidak boleh null/blank (khusus String)     | `@NotBlank private String title;`         |
| `@NotEmpty`                               | Tidak boleh kosong (khusus koleksi/String) | `@NotEmpty List<String> tags;`            |
| `@Min(1)`                                 | Nilai minimum                              | `@Min(1) private int age;`                |
| `@Max(100)`                               | Nilai maksimum                             | `@Max(100) private int score;`            |
| `@Size(min=3, max=10)`                    | Panjang string/koleksi                     | `@Size(min=3) private String username;`   |
| `@Email`                                  | Format email valid                         | `@Email private String email;`            |
| `@Pattern(regexp="\\d{4}-\\d{2}-\\d{2}")` | Format custom (regex)                      | `@Pattern(...) private String birthDate;` |
| `@Positive`                               | Nilai harus positif (> 0)                  | `@Positive private int amount;`           |
| `@Negative`                               | Nilai harus negatif (< 0)                  | `@Negative private int temperature;`      |

#Spring framework core

| Anotasi            | Fungsi                                                |
| ------------------ | ----------------------------------------------------- |
| `@Component`       | Menandai class sebagai bean Spring                    |
| `@Service`         | Sama dengan @Component, tapi khusus service layer     |
| `@Repository`      | Sama, tapi khusus repository dan aktivasi exception   |
| `@Controller`      | Untuk class controller biasa (MVC)                    |
| `@RestController`  | Untuk API (menggabungkan @Controller + @ResponseBody) |
| `@Configuration`   | Menandai class sebagai konfigurasi Spring             |
| `@Bean`            | Menandai method yang mengembalikan bean Spring        |
| `@Autowired`       | Injeksi dependency otomatis                           |
| `@Qualifier`       | Digunakan saat ada lebih dari 1 bean bertipe sama     |
| `@Value("${...}")` | Inject value dari `application.properties`            |
| `@Profile("dev")`  | Menentukan bean hanya aktif di profil tertentu        |

# Spring boot web & REST

| Anotasi                                                        | Fungsi                                  |
| -------------------------------------------------------------- | --------------------------------------- |
| `@RequestMapping`                                              | Mapping umum (bisa GET/POST/etc)        |
| `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping` | Mapping HTTP method spesifik            |
| `@PathVariable`                                                | Ambil data dari URL path                |
| `@RequestParam`                                                | Ambil data dari query param (?name=...) |
| `@RequestBody`                                                 | Ambil data dari body JSON               |
| `@ResponseBody`                                                | Return object sebagai JSON              |
| `@ResponseStatus`                                              | Tentukan status response                |
| `@CrossOrigin`                                                 | Aktifkan CORS dari domain lain          |


# JPA & Database 

| Anotasi                        | Fungsi                                   |
| ------------------------------ | ---------------------------------------- |
| `@Entity`                      | Menandai class sebagai entity JPA        |
| `@Table(name="...")`           | Custom nama tabel                        |
| `@Id`                          | Primary key                              |
| `@GeneratedValue`              | Auto generate id                         |
| `@Column(name="...")`          | Custom nama kolom                        |
| `@ManyToOne`                   | Relasi banyak ke satu                    |
| `@OneToMany(mappedBy=...)`     | Relasi satu ke banyak                    |
| `@JoinColumn(name="...")`      | Nama foreign key                         |
| `@Transient`                   | Field ini tidak akan disimpan di DB      |
| `@Enumerated(EnumType.STRING)` | Simpan enum sebagai string di DB         |
| `@Lob`                         | Untuk menyimpan data besar (teks/gambar) |


# Schedule & Async

| Anotasi                     | Fungsi                                       |
| --------------------------- | -------------------------------------------- |
| `@Scheduled(fixedRate=...)` | Menjalankan method setiap periode waktu (ms) |
| `@Scheduled(cron=...)`      | Gunakan ekspresi cron                        |
| `@EnableScheduling`         | Aktifkan fitur scheduler (pada main class)   |
| `@Async`                    | Jalankan method secara asynchronous          |
| `@EnableAsync`              | Aktifkan async (pada config/main class)      |


# Testing

| Anotasi           | Fungsi                                          |
| ----------------- | ----------------------------------------------- |
| `@SpringBootTest` | Menjalankan seluruh konteks aplikasi untuk test |
| `@WebMvcTest`     | Fokus pada controller saja                      |
| `@DataJpaTest`    | Fokus pada repository JPA                       |
| `@MockBean`       | Menyediakan mock untuk bean tertentu            |
| `@BeforeEach`     | Dieksekusi sebelum setiap test method           |
| `@AfterEach`      | Dieksekusi setelah setiap test method           |
| `@Test`           | Menandai method sebagai test                    |

