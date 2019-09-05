# JPA-Demo
Learning JPA demo code.

## com.pointgenesis.jpa.hibernate.demo
### DemoApplication.java

//TODO:

## com.pointgenesis.jpa.hibernate.demo.entity
### Course.java

//TODO:

### Passport.java

//TODO:

### Review.java

//TODO:

### Student.java

//TODO:

## com.pointgenesis.jpa.hibernate.demo.repository

### CourseRepository.java

//TODO:

### StudentRepository.java

//TODO:

## Console Output

      .   ____          _            __ _ _
     /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
    ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
     \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
      '  |____| .__|_| |_|_| |_\__, | / / / /
     =========|_|==============|___/=/_/_/_/
     :: Spring Boot ::        (v2.0.0.RELEASE)

    2019-08-31 15:20:49.301  INFO 18872 --- [           main] c.p.j.h.d.r.StudentRepositoryTest        : Starting StudentRepositoryTest on trav-alienware-17 with PID 18872 (started by travi in C:\Users\travi\Documents\Personal\projects\application-properties)
    2019-08-31 15:20:49.301  INFO 18872 --- [           main] c.p.j.h.d.r.StudentRepositoryTest        : No active profile set, falling back to default profiles: default
    2019-08-31 15:20:49.472  INFO 18872 --- [           main] o.s.w.c.s.GenericWebApplicationContext   : Refreshing org.springframework.web.context.support.GenericWebApplicationContext@21282ed8: startup date [Sat Aug 31 15:20:49 EDT 2019]; root of context hierarchy
    2019-08-31 15:20:53.349  INFO 18872 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration' of type [org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration$$EnhancerBySpringCGLIB$$f70b239b] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
    2019-08-31 15:20:53.845  INFO 18872 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
    2019-08-31 15:20:54.188  INFO 18872 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
    2019-08-31 15:20:54.313  INFO 18872 --- [           main] j.LocalContainerEntityManagerFactoryBean : Building JPA container EntityManagerFactory for persistence unit 'default'
    2019-08-31 15:20:54.405  INFO 18872 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [
    name: default
    ...]
    2019-08-31 15:20:54.681  INFO 18872 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate Core {5.2.14.Final}
    2019-08-31 15:20:54.683  INFO 18872 --- [           main] org.hibernate.cfg.Environment            : HHH000206: hibernate.properties not found
    2019-08-31 15:20:54.830  INFO 18872 --- [           main] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.0.1.Final}
    2019-08-31 15:20:55.108 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration boolean -> org.hibernate.type.BooleanType@36b310aa
    2019-08-31 15:20:55.109 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration boolean -> org.hibernate.type.BooleanType@36b310aa
    2019-08-31 15:20:55.109 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.lang.Boolean -> org.hibernate.type.BooleanType@36b310aa
    2019-08-31 15:20:55.110 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration numeric_boolean -> org.hibernate.type.NumericBooleanType@1976f537
    2019-08-31 15:20:55.177 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration true_false -> org.hibernate.type.TrueFalseType@783115d9
    2019-08-31 15:20:55.178 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration yes_no -> org.hibernate.type.YesNoType@46d567cb
    2019-08-31 15:20:55.180 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration byte -> org.hibernate.type.ByteType@4efc25fc
    2019-08-31 15:20:55.180 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration byte -> org.hibernate.type.ByteType@4efc25fc
    2019-08-31 15:20:55.180 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.lang.Byte -> org.hibernate.type.ByteType@4efc25fc
    2019-08-31 15:20:55.181 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration character -> org.hibernate.type.CharacterType@3a5c2626
    2019-08-31 15:20:55.181 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration char -> org.hibernate.type.CharacterType@3a5c2626
    2019-08-31 15:20:55.182 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.lang.Character -> org.hibernate.type.CharacterType@3a5c2626
    2019-08-31 15:20:55.183 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration short -> org.hibernate.type.ShortType@d74bac4
    2019-08-31 15:20:55.184 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration short -> org.hibernate.type.ShortType@d74bac4
    2019-08-31 15:20:55.184 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.lang.Short -> org.hibernate.type.ShortType@d74bac4
    2019-08-31 15:20:55.257 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration integer -> org.hibernate.type.IntegerType@4b7c4456
    2019-08-31 15:20:55.257 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration int -> org.hibernate.type.IntegerType@4b7c4456
    2019-08-31 15:20:55.257 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.lang.Integer -> org.hibernate.type.IntegerType@4b7c4456
    2019-08-31 15:20:55.274 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration long -> org.hibernate.type.LongType@5d5b5fa7
    2019-08-31 15:20:55.275 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration long -> org.hibernate.type.LongType@5d5b5fa7
    2019-08-31 15:20:55.275 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.lang.Long -> org.hibernate.type.LongType@5d5b5fa7
    2019-08-31 15:20:55.276 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration float -> org.hibernate.type.FloatType@7bc6d27a
    2019-08-31 15:20:55.277 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration float -> org.hibernate.type.FloatType@7bc6d27a
    2019-08-31 15:20:55.277 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.lang.Float -> org.hibernate.type.FloatType@7bc6d27a
    2019-08-31 15:20:55.278 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration double -> org.hibernate.type.DoubleType@cb03411
    2019-08-31 15:20:55.278 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration double -> org.hibernate.type.DoubleType@cb03411
    2019-08-31 15:20:55.278 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.lang.Double -> org.hibernate.type.DoubleType@cb03411
    2019-08-31 15:20:55.280 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration big_decimal -> org.hibernate.type.BigDecimalType@1aac188d
    2019-08-31 15:20:55.280 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.math.BigDecimal -> org.hibernate.type.BigDecimalType@1aac188d
    2019-08-31 15:20:55.281 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration big_integer -> org.hibernate.type.BigIntegerType@43f61afb
    2019-08-31 15:20:55.281 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.math.BigInteger -> org.hibernate.type.BigIntegerType@43f61afb
    2019-08-31 15:20:55.282 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration string -> org.hibernate.type.StringType@1ac45389
    2019-08-31 15:20:55.282 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.lang.String -> org.hibernate.type.StringType@1ac45389
    2019-08-31 15:20:55.284 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration nstring -> org.hibernate.type.StringNVarcharType@367b22e5
    2019-08-31 15:20:55.284 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration ncharacter -> org.hibernate.type.CharacterNCharType@30e6a763
    2019-08-31 15:20:55.285 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration url -> org.hibernate.type.UrlType@36ddaebf
    2019-08-31 15:20:55.286 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.net.URL -> org.hibernate.type.UrlType@36ddaebf
    2019-08-31 15:20:55.287 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration Duration -> org.hibernate.type.DurationType@7c29adc8
    2019-08-31 15:20:55.287 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.time.Duration -> org.hibernate.type.DurationType@7c29adc8
    2019-08-31 15:20:55.288 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration Instant -> org.hibernate.type.InstantType@514cd540
    2019-08-31 15:20:55.289 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.time.Instant -> org.hibernate.type.InstantType@514cd540
    2019-08-31 15:20:55.290 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration LocalDateTime -> org.hibernate.type.LocalDateTimeType@390877d2
    2019-08-31 15:20:55.290 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.time.LocalDateTime -> org.hibernate.type.LocalDateTimeType@390877d2
    2019-08-31 15:20:55.292 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration LocalDate -> org.hibernate.type.LocalDateType@53a5e217
    2019-08-31 15:20:55.292 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.time.LocalDate -> org.hibernate.type.LocalDateType@53a5e217
    2019-08-31 15:20:55.293 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration LocalTime -> org.hibernate.type.LocalTimeType@2f98635e
    2019-08-31 15:20:55.294 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.time.LocalTime -> org.hibernate.type.LocalTimeType@2f98635e
    2019-08-31 15:20:55.295 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration OffsetDateTime -> org.hibernate.type.OffsetDateTimeType@2cec704c
    2019-08-31 15:20:55.295 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.time.OffsetDateTime -> org.hibernate.type.OffsetDateTimeType@2cec704c
    2019-08-31 15:20:55.296 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration OffsetTime -> org.hibernate.type.OffsetTimeType@3659d7b1
    2019-08-31 15:20:55.296 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.time.OffsetTime -> org.hibernate.type.OffsetTimeType@3659d7b1
    2019-08-31 15:20:55.299 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration ZonedDateTime -> org.hibernate.type.ZonedDateTimeType@3ffb3598
    2019-08-31 15:20:55.299 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.time.ZonedDateTime -> org.hibernate.type.ZonedDateTimeType@3ffb3598
    2019-08-31 15:20:55.300 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration date -> org.hibernate.type.DateType@7b78ed6a
    2019-08-31 15:20:55.301 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.sql.Date -> org.hibernate.type.DateType@7b78ed6a
    2019-08-31 15:20:55.302 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration time -> org.hibernate.type.TimeType@7afb1741
    2019-08-31 15:20:55.302 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.sql.Time -> org.hibernate.type.TimeType@7afb1741
    2019-08-31 15:20:55.303 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration timestamp -> org.hibernate.type.TimestampType@3e84111a
    2019-08-31 15:20:55.303 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.sql.Timestamp -> org.hibernate.type.TimestampType@3e84111a
    2019-08-31 15:20:55.303 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.util.Date -> org.hibernate.type.TimestampType@3e84111a
    2019-08-31 15:20:55.304 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration dbtimestamp -> org.hibernate.type.DbTimestampType@73545b80
    2019-08-31 15:20:55.306 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration calendar -> org.hibernate.type.CalendarType@2776015d
    2019-08-31 15:20:55.306 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.util.Calendar -> org.hibernate.type.CalendarType@2776015d
    2019-08-31 15:20:55.306 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.util.GregorianCalendar -> org.hibernate.type.CalendarType@2776015d
    2019-08-31 15:20:55.306 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration calendar_date -> org.hibernate.type.CalendarDateType@1460c81d
    2019-08-31 15:20:55.307 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration locale -> org.hibernate.type.LocaleType@2cc04358
    2019-08-31 15:20:55.307 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.util.Locale -> org.hibernate.type.LocaleType@2cc04358
    2019-08-31 15:20:55.308 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration currency -> org.hibernate.type.CurrencyType@d48673
    2019-08-31 15:20:55.308 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.util.Currency -> org.hibernate.type.CurrencyType@d48673
    2019-08-31 15:20:55.309 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration timezone -> org.hibernate.type.TimeZoneType@42d73c61
    2019-08-31 15:20:55.309 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.util.TimeZone -> org.hibernate.type.TimeZoneType@42d73c61
    2019-08-31 15:20:55.310 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration class -> org.hibernate.type.ClassType@25e49cb2
    2019-08-31 15:20:55.310 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.lang.Class -> org.hibernate.type.ClassType@25e49cb2
    2019-08-31 15:20:55.312 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration uuid-binary -> org.hibernate.type.UUIDBinaryType@5b84f14
    2019-08-31 15:20:55.313 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.util.UUID -> org.hibernate.type.UUIDBinaryType@5b84f14
    2019-08-31 15:20:55.313 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration uuid-char -> org.hibernate.type.UUIDCharType@379ce046
    2019-08-31 15:20:55.315 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration binary -> org.hibernate.type.BinaryType@5918c260
    2019-08-31 15:20:55.315 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration byte[] -> org.hibernate.type.BinaryType@5918c260
    2019-08-31 15:20:55.315 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration [B -> org.hibernate.type.BinaryType@5918c260
    2019-08-31 15:20:55.317 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration wrapper-binary -> org.hibernate.type.WrapperBinaryType@65b66b08
    2019-08-31 15:20:55.317 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration Byte[] -> org.hibernate.type.WrapperBinaryType@65b66b08
    2019-08-31 15:20:55.317 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration [Ljava.lang.Byte; -> org.hibernate.type.WrapperBinaryType@65b66b08
    2019-08-31 15:20:55.319 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration row_version -> org.hibernate.type.RowVersionType@5b275174
    2019-08-31 15:20:55.321 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration image -> org.hibernate.type.ImageType@b25b095
    2019-08-31 15:20:55.322 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration characters -> org.hibernate.type.CharArrayType@2f651f93
    2019-08-31 15:20:55.323 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration char[] -> org.hibernate.type.CharArrayType@2f651f93
    2019-08-31 15:20:55.323 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration [C -> org.hibernate.type.CharArrayType@2f651f93
    2019-08-31 15:20:55.325 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration wrapper-characters -> org.hibernate.type.CharacterArrayType@4e93dcb9
    2019-08-31 15:20:55.325 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration [Ljava.lang.Character; -> org.hibernate.type.CharacterArrayType@4e93dcb9
    2019-08-31 15:20:55.325 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration Character[] -> org.hibernate.type.CharacterArrayType@4e93dcb9
    2019-08-31 15:20:55.326 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration text -> org.hibernate.type.TextType@7c891ba7
    2019-08-31 15:20:55.327 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration ntext -> org.hibernate.type.NTextType@5496c165
    2019-08-31 15:20:55.336 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration blob -> org.hibernate.type.BlobType@719bb3b4
    2019-08-31 15:20:55.336 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.sql.Blob -> org.hibernate.type.BlobType@719bb3b4
    2019-08-31 15:20:55.336 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration materialized_blob -> org.hibernate.type.MaterializedBlobType@4d27d9d
    2019-08-31 15:20:55.340 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration clob -> org.hibernate.type.ClobType@1744a475
    2019-08-31 15:20:55.340 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.sql.Clob -> org.hibernate.type.ClobType@1744a475
    2019-08-31 15:20:55.343 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration nclob -> org.hibernate.type.NClobType@71466383
    2019-08-31 15:20:55.343 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.sql.NClob -> org.hibernate.type.NClobType@71466383
    2019-08-31 15:20:55.343 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration materialized_clob -> org.hibernate.type.MaterializedClobType@16a49a5d
    2019-08-31 15:20:55.343 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration materialized_nclob -> org.hibernate.type.MaterializedNClobType@205bed61
    2019-08-31 15:20:55.359 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration serializable -> org.hibernate.type.SerializableType@5c60b0a0
    2019-08-31 15:20:55.362 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration object -> org.hibernate.type.ObjectType@8ee0c23
    2019-08-31 15:20:55.362 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration java.lang.Object -> org.hibernate.type.ObjectType@8ee0c23
    2019-08-31 15:20:55.363 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration imm_date -> org.hibernate.type.AdaptedImmutableType@e4b6f47
    2019-08-31 15:20:55.363 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration imm_time -> org.hibernate.type.AdaptedImmutableType@763cf5b9
    2019-08-31 15:20:55.363 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration imm_timestamp -> org.hibernate.type.AdaptedImmutableType@71f0b72e
    2019-08-31 15:20:55.363 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration imm_dbtimestamp -> org.hibernate.type.AdaptedImmutableType@7a34f66a
    2019-08-31 15:20:55.363 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration imm_calendar -> org.hibernate.type.AdaptedImmutableType@2f508f3c
    2019-08-31 15:20:55.363 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration imm_calendar_date -> org.hibernate.type.AdaptedImmutableType@3ed03652
    2019-08-31 15:20:55.363 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration imm_binary -> org.hibernate.type.AdaptedImmutableType@4aedaf61
    2019-08-31 15:20:55.364 DEBUG 18872 --- [           main] org.hibernate.type.BasicTypeRegistry     : Adding type registration imm_serializable -> org.hibernate.type.AdaptedImmutableType@173797f0
    2019-08-31 15:20:55.424  INFO 18872 --- [           main] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
    2019-08-31 15:20:56.431 TRACE 18872 --- [           main] org.hibernate.type.TypeFactory           : Scoping types to session factory org.hibernate.internal.SessionFactoryImpl@35e26d05
    Hibernate: 

        drop table course if exists
    Hibernate: 

        drop table passport if exists
    Hibernate: 

        drop table review if exists
    Hibernate: 

        drop table student if exists
    Hibernate: 

        drop table student_course if exists
    Hibernate: 

        drop sequence if exists hibernate_sequence
    Hibernate: create sequence hibernate_sequence start with 1 increment by 1
    Hibernate: 

        create table course (
           id bigint not null,
            created_on_date timestamp,
            last_updated_date timestamp,
            name varchar(255) not null,
            primary key (id)
        )
    Hibernate: 

        create table passport (
           id bigint not null,
            number varchar(255) not null,
            primary key (id)
        )
    Hibernate: 

        create table review (
           id bigint not null,
            description varchar(255),
            rating varchar(255),
            course_id bigint,
            primary key (id)
        )
    Hibernate: 

        create table student (
           id bigint not null,
            name varchar(255) not null,
            passport_id bigint,
            primary key (id)
        )
    Hibernate: 

        create table student_course (
           student_id bigint not null,
            course_id bigint not null
        )
    Hibernate: 

        alter table review 
           add constraint FKprox8elgnr8u5wrq1983degk 
           foreign key (course_id) 
           references course
    Hibernate: 

        alter table student 
           add constraint FK6i2dofwfuu97njtfprqv68pib 
           foreign key (passport_id) 
           references passport
    Hibernate: 

        alter table student_course 
           add constraint FKejrkh4gv8iqgmspsanaji90ws 
           foreign key (course_id) 
           references course
    Hibernate: 

        alter table student_course 
           add constraint FKq7yw2wg9wlt2cnj480hcdn6dq 
           foreign key (student_id) 
           references student
    2019-08-31 15:20:56.962  INFO 18872 --- [           main] o.h.t.schema.internal.SchemaCreatorImpl  : HHH000476: Executing import script 'org.hibernate.tool.schema.internal.exec.ScriptSourceInputNonExistentImpl@1290ed28'
    2019-08-31 15:20:56.976  INFO 18872 --- [           main] o.h.h.i.QueryTranslatorFactoryInitiator  : HHH000397: Using ASTQueryTranslatorFactory
    2019-08-31 15:20:57.101  INFO 18872 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
    2019-08-31 15:20:57.138  INFO 18872 --- [           main] o.s.jdbc.datasource.init.ScriptUtils     : Executing SQL script from URL [file:/C:/Users/travi/Documents/Personal/projects/application-properties/target/classes/data.sql]
    2019-08-31 15:20:57.173  INFO 18872 --- [           main] o.s.jdbc.datasource.init.ScriptUtils     : Executed SQL script from URL [file:/C:/Users/travi/Documents/Personal/projects/application-properties/target/classes/data.sql] in 35 ms.
    2019-08-31 15:20:58.419  INFO 18872 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.web.context.support.GenericWebApplicationContext@21282ed8: startup date [Sat Aug 31 15:20:49 EDT 2019]; root of context hierarchy
    2019-08-31 15:20:58.511  WARN 18872 --- [           main] aWebConfiguration$JpaWebMvcConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
    2019-08-31 15:20:58.582  INFO 18872 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
    2019-08-31 15:20:58.584  INFO 18872 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
    2019-08-31 15:20:58.645  INFO 18872 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
    2019-08-31 15:20:58.645  INFO 18872 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
    2019-08-31 15:20:58.722  INFO 18872 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
    2019-08-31 15:20:59.252  INFO 18872 --- [           main] c.p.j.h.d.r.StudentRepositoryTest        : Started StudentRepositoryTest in 11.133 seconds (JVM running for 16.69)
    Hibernate: 
        select
            course0_.id as id1_0_0_,
            course0_.created_on_date as created_2_0_0_,
            course0_.last_updated_date as last_upd3_0_0_,
            course0_.name as name4_0_0_ 
        from
            course course0_ 
        where
            course0_.id=?
    2019-08-31 15:20:59.450 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [BIGINT] - [10001]
    2019-08-31 15:20:59.489 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicExtractor   : extracted value ([created_2_0_0_] : [TIMESTAMP]) - [2019-08-31T15:20:57.158]
    2019-08-31 15:20:59.490 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicExtractor   : extracted value ([last_upd3_0_0_] : [TIMESTAMP]) - [2019-08-31T15:20:57.158]
    2019-08-31 15:20:59.491 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicExtractor   : extracted value ([name4_0_0_] : [VARCHAR]) - [JPA in 50 Steps]
    2019-08-31 15:20:59.524 TRACE 18872 --- [           main] org.hibernate.type.CollectionType        : Created collection wrapper: [com.pointgenesis.jpa.hibernate.demo.entity.Course.reviews#10001]
    2019-08-31 15:20:59.524 TRACE 18872 --- [           main] org.hibernate.type.CollectionType        : Created collection wrapper: [com.pointgenesis.jpa.hibernate.demo.entity.Course.students#10001]
    2019-08-31 15:20:59.539  INFO 18872 --- [           main] i.StatisticalLoggingSessionEventListener : Session Metrics {
        132900 nanoseconds spent acquiring 1 JDBC connections;
        0 nanoseconds spent releasing 0 JDBC connections;
        3847900 nanoseconds spent preparing 1 JDBC statements;
        6299800 nanoseconds spent executing 1 JDBC statements;
        0 nanoseconds spent executing 0 JDBC batches;
        0 nanoseconds spent performing 0 L2C puts;
        0 nanoseconds spent performing 0 L2C hits;
        0 nanoseconds spent performing 0 L2C misses;
        9643300 nanoseconds spent executing 1 flushes (flushing a total of 1 entities and 2 collections);
        0 nanoseconds spent executing 0 partial-flushes (flushing a total of 0 entities and 0 collections)
    }
    2019-08-31 15:20:59.541  INFO 18872 --- [           main] ication$$EnhancerBySpringCGLIB$$396a2b3a : Course(10001) --> Course [id=10001, name=JPA in 50 Steps]
    Hibernate: 
        call next value for hibernate_sequence
    Hibernate: 
        insert 
        into
            course
            (created_on_date, last_updated_date, name, id) 
        values
            (?, ?, ?, ?)
    2019-08-31 15:20:59.600 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [TIMESTAMP] - [2019-08-31T15:20:59.575]
    2019-08-31 15:20:59.601 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [2] as [TIMESTAMP] - [2019-08-31T15:20:59.576]
    2019-08-31 15:20:59.602 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [3] as [VARCHAR] - [Paint by Numbers]
    2019-08-31 15:20:59.602 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [4] as [BIGINT] - [1]
    2019-08-31 15:20:59.604  INFO 18872 --- [           main] i.StatisticalLoggingSessionEventListener : Session Metrics {
        17300 nanoseconds spent acquiring 1 JDBC connections;
        0 nanoseconds spent releasing 0 JDBC connections;
        374800 nanoseconds spent preparing 2 JDBC statements;
        1960400 nanoseconds spent executing 2 JDBC statements;
        0 nanoseconds spent executing 0 JDBC batches;
        0 nanoseconds spent performing 0 L2C puts;
        0 nanoseconds spent performing 0 L2C hits;
        0 nanoseconds spent performing 0 L2C misses;
        47156300 nanoseconds spent executing 1 flushes (flushing a total of 1 entities and 2 collections);
        0 nanoseconds spent executing 0 partial-flushes (flushing a total of 0 entities and 0 collections)
    }
    Hibernate: 
        call next value for hibernate_sequence
    Hibernate: 
        select
            course0_.id as id1_0_0_,
            course0_.created_on_date as created_2_0_0_,
            course0_.last_updated_date as last_upd3_0_0_,
            course0_.name as name4_0_0_ 
        from
            course course0_ 
        where
            course0_.id=?
    2019-08-31 15:20:59.606 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [BIGINT] - [10001]
    2019-08-31 15:20:59.607 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicExtractor   : extracted value ([created_2_0_0_] : [TIMESTAMP]) - [2019-08-31T15:20:57.158]
    2019-08-31 15:20:59.607 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicExtractor   : extracted value ([last_upd3_0_0_] : [TIMESTAMP]) - [2019-08-31T15:20:57.158]
    2019-08-31 15:20:59.607 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicExtractor   : extracted value ([name4_0_0_] : [VARCHAR]) - [JPA in 50 Steps]
    2019-08-31 15:20:59.607 TRACE 18872 --- [           main] org.hibernate.type.CollectionType        : Created collection wrapper: [com.pointgenesis.jpa.hibernate.demo.entity.Course.reviews#10001]
    2019-08-31 15:20:59.607 TRACE 18872 --- [           main] org.hibernate.type.CollectionType        : Created collection wrapper: [com.pointgenesis.jpa.hibernate.demo.entity.Course.students#10001]
    Hibernate: 
        insert 
        into
            course
            (created_on_date, last_updated_date, name, id) 
        values
            (?, ?, ?, ?)
    2019-08-31 15:20:59.609 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [TIMESTAMP] - [2019-08-31T15:20:59.608]
    2019-08-31 15:20:59.609 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [2] as [TIMESTAMP] - [2019-08-31T15:20:59.608]
    2019-08-31 15:20:59.609 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [3] as [VARCHAR] - [How to shoot a bear]
    2019-08-31 15:20:59.609 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [4] as [BIGINT] - [2]
    Hibernate: 
        update
            course 
        set
            created_on_date=?,
            last_updated_date=?,
            name=? 
        where
            id=?
    2019-08-31 15:20:59.611 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [TIMESTAMP] - [2019-08-31T15:20:57.158]
    2019-08-31 15:20:59.611 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [2] as [TIMESTAMP] - [2019-08-31T15:20:59.610]
    2019-08-31 15:20:59.612 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [3] as [VARCHAR] - [How to shoot a bear with a Bear]
    2019-08-31 15:20:59.612 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [4] as [BIGINT] - [10001]
    2019-08-31 15:20:59.615  INFO 18872 --- [           main] i.StatisticalLoggingSessionEventListener : Session Metrics {
        17600 nanoseconds spent acquiring 1 JDBC connections;
        0 nanoseconds spent releasing 0 JDBC connections;
        699900 nanoseconds spent preparing 4 JDBC statements;
        1666200 nanoseconds spent executing 4 JDBC statements;
        0 nanoseconds spent executing 0 JDBC batches;
        0 nanoseconds spent performing 0 L2C puts;
        0 nanoseconds spent performing 0 L2C hits;
        0 nanoseconds spent performing 0 L2C misses;
        7336000 nanoseconds spent executing 1 flushes (flushing a total of 2 entities and 4 collections);
        0 nanoseconds spent executing 0 partial-flushes (flushing a total of 0 entities and 0 collections)
    }
    Hibernate: 
        call next value for hibernate_sequence
    Hibernate: 
        call next value for hibernate_sequence
    Hibernate: 
        insert 
        into
            passport
            (number, id) 
        values
            (?, ?)
    2019-08-31 15:20:59.623 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [VARCHAR] - [Z1238585]
    2019-08-31 15:20:59.623 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [2] as [BIGINT] - [3]
    Hibernate: 
        insert 
        into
            student
            (name, passport_id, id) 
        values
            (?, ?, ?)
    2019-08-31 15:20:59.624 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [VARCHAR] - [Derek]
    2019-08-31 15:20:59.624 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [2] as [BIGINT] - [3]
    2019-08-31 15:20:59.624 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [3] as [BIGINT] - [4]
    2019-08-31 15:20:59.625  INFO 18872 --- [           main] i.StatisticalLoggingSessionEventListener : Session Metrics {
        19400 nanoseconds spent acquiring 1 JDBC connections;
        0 nanoseconds spent releasing 0 JDBC connections;
        228700 nanoseconds spent preparing 4 JDBC statements;
        380200 nanoseconds spent executing 4 JDBC statements;
        0 nanoseconds spent executing 0 JDBC batches;
        0 nanoseconds spent performing 0 L2C puts;
        0 nanoseconds spent performing 0 L2C hits;
        0 nanoseconds spent performing 0 L2C misses;
        2088100 nanoseconds spent executing 1 flushes (flushing a total of 2 entities and 1 collections);
        0 nanoseconds spent executing 0 partial-flushes (flushing a total of 0 entities and 0 collections)
    }
    Hibernate: 
        select
            course0_.id as id1_0_0_,
            course0_.created_on_date as created_2_0_0_,
            course0_.last_updated_date as last_upd3_0_0_,
            course0_.name as name4_0_0_ 
        from
            course course0_ 
        where
            course0_.id=?
    2019-08-31 15:20:59.626 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [BIGINT] - [10001]
    2019-08-31 15:20:59.626 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicExtractor   : extracted value ([created_2_0_0_] : [TIMESTAMP]) - [2019-08-31T15:20:57.158]
    2019-08-31 15:20:59.627 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicExtractor   : extracted value ([last_upd3_0_0_] : [TIMESTAMP]) - [2019-08-31T15:20:59.610]
    2019-08-31 15:20:59.627 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicExtractor   : extracted value ([name4_0_0_] : [VARCHAR]) - [How to shoot a bear with a Bear]
    2019-08-31 15:20:59.627 TRACE 18872 --- [           main] org.hibernate.type.CollectionType        : Created collection wrapper: [com.pointgenesis.jpa.hibernate.demo.entity.Course.reviews#10001]
    2019-08-31 15:20:59.627 TRACE 18872 --- [           main] org.hibernate.type.CollectionType        : Created collection wrapper: [com.pointgenesis.jpa.hibernate.demo.entity.Course.students#10001]
    Hibernate: 
        select
            reviews0_.course_id as course_i4_2_0_,
            reviews0_.id as id1_2_0_,
            reviews0_.id as id1_2_1_,
            reviews0_.course_id as course_i4_2_1_,
            reviews0_.description as descript2_2_1_,
            reviews0_.rating as rating3_2_1_ 
        from
            review reviews0_ 
        where
            reviews0_.course_id=?
    2019-08-31 15:20:59.627  INFO 18872 --- [           main] c.p.j.h.d.repository.CourseRepository    : course.getReviews --> [Review [id=50001, description=Great Course rating=5], Review [id=50002, description=Good Course rating=4], Review [id=50003, description=Average Course rating=3], Review [id=50005, description=Poor Course rating=1]]
    Hibernate: 
        call next value for hibernate_sequence
    Hibernate: 
        call next value for hibernate_sequence
    Hibernate: 
        call next value for hibernate_sequence
    Hibernate: 
        call next value for hibernate_sequence
    Hibernate: 
        insert 
        into
            review
            (course_id, description, rating, id) 
        values
            (?, ?, ?, ?)
    2019-08-31 15:20:59.638 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [BIGINT] - [10001]
    2019-08-31 15:20:59.638 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [2] as [VARCHAR] - [SpringBoot/JPA is awesome]
    2019-08-31 15:20:59.638 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [3] as [VARCHAR] - [5]
    2019-08-31 15:20:59.639 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [4] as [BIGINT] - [5]
    Hibernate: 
        insert 
        into
            review
            (course_id, description, rating, id) 
        values
            (?, ?, ?, ?)
    2019-08-31 15:20:59.640 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [BIGINT] - [10001]
    2019-08-31 15:20:59.640 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [2] as [VARCHAR] - [Class is really great]
    2019-08-31 15:20:59.640 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [3] as [VARCHAR] - [4]
    2019-08-31 15:20:59.640 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [4] as [BIGINT] - [6]
    Hibernate: 
        insert 
        into
            review
            (course_id, description, rating, id) 
        values
            (?, ?, ?, ?)
    2019-08-31 15:20:59.641 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [BIGINT] - [10001]
    2019-08-31 15:20:59.641 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [2] as [VARCHAR] - [Bears hibernate]
    2019-08-31 15:20:59.641 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [3] as [VARCHAR] - [2]
    2019-08-31 15:20:59.641 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [4] as [BIGINT] - [7]
    Hibernate: 
        insert 
        into
            review
            (course_id, description, rating, id) 
        values
            (?, ?, ?, ?)
    2019-08-31 15:20:59.642 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [BIGINT] - [10001]
    2019-08-31 15:20:59.642 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [2] as [VARCHAR] - [Hello]
    2019-08-31 15:20:59.642 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [3] as [VARCHAR] - [3]
    2019-08-31 15:20:59.642 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [4] as [BIGINT] - [8]
    2019-08-31 15:20:59.643  INFO 18872 --- [           main] i.StatisticalLoggingSessionEventListener : Session Metrics {
        15900 nanoseconds spent acquiring 1 JDBC connections;
        0 nanoseconds spent releasing 0 JDBC connections;
        611500 nanoseconds spent preparing 10 JDBC statements;
        1480100 nanoseconds spent executing 10 JDBC statements;
        0 nanoseconds spent executing 0 JDBC batches;
        0 nanoseconds spent performing 0 L2C puts;
        0 nanoseconds spent performing 0 L2C hits;
        0 nanoseconds spent performing 0 L2C misses;
        5950200 nanoseconds spent executing 1 flushes (flushing a total of 9 entities and 2 collections);
        0 nanoseconds spent executing 0 partial-flushes (flushing a total of 0 entities and 0 collections)
    }
    Hibernate: 
        call next value for hibernate_sequence
    Hibernate: 
        call next value for hibernate_sequence
    Hibernate: 
        insert 
        into
            student
            (name, passport_id, id) 
        values
            (?, ?, ?)
    2019-08-31 15:20:59.645 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [VARCHAR] - [Jack]
    2019-08-31 15:20:59.646 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [2] as [BIGINT] - [null]
    2019-08-31 15:20:59.646 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [3] as [BIGINT] - [9]
    Hibernate: 
        insert 
        into
            course
            (created_on_date, last_updated_date, name, id) 
        values
            (?, ?, ?, ?)
    2019-08-31 15:20:59.646 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [TIMESTAMP] - [2019-08-31T15:20:59.646]
    2019-08-31 15:20:59.647 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [2] as [TIMESTAMP] - [2019-08-31T15:20:59.646]
    2019-08-31 15:20:59.647 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [3] as [VARCHAR] - [Microservices in 100 Steps is Awesome!]
    2019-08-31 15:20:59.647 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [4] as [BIGINT] - [10]
    Hibernate: 
        insert 
        into
            student_course
            (student_id, course_id) 
        values
            (?, ?)
    2019-08-31 15:20:59.648 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [BIGINT] - [9]
    2019-08-31 15:20:59.648 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [2] as [BIGINT] - [10]
    2019-08-31 15:20:59.649  INFO 18872 --- [           main] i.StatisticalLoggingSessionEventListener : Session Metrics {
        17600 nanoseconds spent acquiring 1 JDBC connections;
        0 nanoseconds spent releasing 0 JDBC connections;
        186000 nanoseconds spent preparing 5 JDBC statements;
        549800 nanoseconds spent executing 5 JDBC statements;
        0 nanoseconds spent executing 0 JDBC batches;
        0 nanoseconds spent performing 0 L2C puts;
        0 nanoseconds spent performing 0 L2C hits;
        0 nanoseconds spent performing 0 L2C misses;
        3317000 nanoseconds spent executing 1 flushes (flushing a total of 2 entities and 3 collections);
        0 nanoseconds spent executing 0 partial-flushes (flushing a total of 0 entities and 0 collections)
    }
    Hibernate: 
        call next value for hibernate_sequence
    Hibernate: 
        call next value for hibernate_sequence
    Hibernate: 
        insert 
        into
            student
            (name, passport_id, id) 
        values
            (?, ?, ?)
    2019-08-31 15:20:59.651 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [VARCHAR] - [jerry berry]
    2019-08-31 15:20:59.651 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [2] as [BIGINT] - [null]
    2019-08-31 15:20:59.651 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [3] as [BIGINT] - [11]
    Hibernate: 
        insert 
        into
            course
            (created_on_date, last_updated_date, name, id) 
        values
            (?, ?, ?, ?)
    2019-08-31 15:20:59.652 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [TIMESTAMP] - [2019-08-31T15:20:59.651]
    2019-08-31 15:20:59.652 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [2] as [TIMESTAMP] - [2019-08-31T15:20:59.651]
    2019-08-31 15:20:59.652 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [3] as [VARCHAR] - [Sleeping for Dummies]
    2019-08-31 15:20:59.652 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [4] as [BIGINT] - [12]
    Hibernate: 
        insert 
        into
            student_course
            (student_id, course_id) 
        values
            (?, ?)
    2019-08-31 15:20:59.653 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [BIGINT] - [11]
    2019-08-31 15:20:59.653 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [2] as [BIGINT] - [12]
    2019-08-31 15:20:59.653  INFO 18872 --- [           main] i.StatisticalLoggingSessionEventListener : Session Metrics {
        16100 nanoseconds spent acquiring 1 JDBC connections;
        0 nanoseconds spent releasing 0 JDBC connections;
        142500 nanoseconds spent preparing 5 JDBC statements;
        524100 nanoseconds spent executing 5 JDBC statements;
        0 nanoseconds spent executing 0 JDBC batches;
        0 nanoseconds spent performing 0 L2C puts;
        0 nanoseconds spent performing 0 L2C hits;
        0 nanoseconds spent performing 0 L2C misses;
        3027600 nanoseconds spent executing 1 flushes (flushing a total of 2 entities and 3 collections);
        0 nanoseconds spent executing 0 partial-flushes (flushing a total of 0 entities and 0 collections)
    }
    2019-08-31 15:20:59.707  INFO 18872 --- [           main] o.s.t.c.transaction.TransactionContext   : Began transaction (1) for test context [DefaultTestContext@393671df testClass = StudentRepositoryTest, testInstance = com.pointgenesis.jpa.hibernate.demo.repository.StudentRepositoryTest@27da994b, testMethod = retrieveStudentAndPassportDetails@StudentRepositoryTest, testException = [null], mergedContextConfiguration = [WebMergedContextConfiguration@56620197 testClass = StudentRepositoryTest, locations = '{}', classes = '{class com.pointgenesis.jpa.hibernate.demo.DemoApplication, class com.pointgenesis.jpa.hibernate.demo.DemoApplication}', contextInitializerClasses = '[]', activeProfiles = '{}', propertySourceLocations = '{}', propertySourceProperties = '{org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true}', contextCustomizers = set[org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@ea1a8d5, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@30a3107a, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@3d921e20, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@60285225], resourceBasePath = 'src/main/webapp', contextLoader = 'org.springframework.boot.test.context.SpringBootContextLoader', parent = [null]], attributes = map['org.springframework.test.context.web.ServletTestExecutionListener.activateListener' -> true, 'org.springframework.test.context.web.ServletTestExecutionListener.populatedRequestContextHolder' -> true, 'org.springframework.test.context.web.ServletTestExecutionListener.resetRequestContextHolder' -> true]]; transaction manager [org.springframework.orm.jpa.JpaTransactionManager@784d9bc]; rollback [true]
    2019-08-31 15:21:00.198  INFO 18872 --- [           main] c.p.j.h.d.r.StudentRepositoryTest        : retrieveStudentAndPassportDetails is running.
    Hibernate: 
        select
            student0_.id as id1_3_0_,
            student0_.name as name2_3_0_,
            student0_.passport_id as passport3_3_0_,
            courses1_.student_id as student_1_4_1_,
            course2_.id as course_i2_4_1_,
            course2_.id as id1_0_2_,
            course2_.created_on_date as created_2_0_2_,
            course2_.last_updated_date as last_upd3_0_2_,
            course2_.name as name4_0_2_ 
        from
            student student0_ 
        left outer join
            student_course courses1_ 
                on student0_.id=courses1_.student_id 
        left outer join
            course course2_ 
                on courses1_.course_id=course2_.id 
        where
            student0_.id=?
    2019-08-31 15:21:00.201 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [BIGINT] - [20001]
    2019-08-31 15:21:00.201 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicExtractor   : extracted value ([id1_0_2_] : [BIGINT]) - [10001]
    2019-08-31 15:21:00.202 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicExtractor   : extracted value ([name2_3_0_] : [VARCHAR]) - [Don]
    2019-08-31 15:21:00.202 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicExtractor   : extracted value ([passport3_3_0_] : [BIGINT]) - [40001]
    2019-08-31 15:21:00.202 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicExtractor   : extracted value ([created_2_0_2_] : [TIMESTAMP]) - [2019-08-31T15:20:57.158]
    2019-08-31 15:21:00.202 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicExtractor   : extracted value ([last_upd3_0_2_] : [TIMESTAMP]) - [2019-08-31T15:20:59.610]
    2019-08-31 15:21:00.202 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicExtractor   : extracted value ([name4_0_2_] : [VARCHAR]) - [How to shoot a bear with a Bear]
    2019-08-31 15:21:00.202 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicExtractor   : extracted value ([student_1_4_1_] : [BIGINT]) - [20001]
    2019-08-31 15:21:00.202 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicExtractor   : extracted value ([course_i2_4_1_] : [BIGINT]) - [10001]
    2019-08-31 15:21:00.214 TRACE 18872 --- [           main] org.hibernate.type.CollectionType        : Created collection wrapper: [com.pointgenesis.jpa.hibernate.demo.entity.Course.reviews#10001]
    2019-08-31 15:21:00.214 TRACE 18872 --- [           main] org.hibernate.type.CollectionType        : Created collection wrapper: [com.pointgenesis.jpa.hibernate.demo.entity.Course.students#10001]
    Hibernate: 
        select
            passport0_.id as id1_1_0_,
            passport0_.number as number2_1_0_ 
        from
            passport passport0_ 
        where
            passport0_.id=?
    Hibernate: 
        select
            student0_.id as id1_3_1_,
            student0_.name as name2_3_1_,
            student0_.passport_id as passport3_3_1_,
            courses1_.student_id as student_1_4_3_,
            course2_.id as course_i2_4_3_,
            course2_.id as id1_0_0_,
            course2_.created_on_date as created_2_0_0_,
            course2_.last_updated_date as last_upd3_0_0_,
            course2_.name as name4_0_0_ 
        from
            student student0_ 
        left outer join
            student_course courses1_ 
                on student0_.id=courses1_.student_id 
        left outer join
            course course2_ 
                on courses1_.course_id=course2_.id 
        where
            student0_.passport_id=?
    2019-08-31 15:21:00.214  INFO 18872 --- [           main] c.p.j.h.d.r.StudentRepositoryTest        : Student: Student [id=20001, name=Don, passport=Passport [id=40001, number=E123456789]]
    2019-08-31 15:21:00.220  INFO 18872 --- [           main] c.p.j.h.d.r.StudentRepositoryTest        : Passport: Passport [id=40001, number=E123456789]
    2019-08-31 15:21:00.241  INFO 18872 --- [           main] i.StatisticalLoggingSessionEventListener : Session Metrics {
        16900 nanoseconds spent acquiring 1 JDBC connections;
        0 nanoseconds spent releasing 0 JDBC connections;
        2522000 nanoseconds spent preparing 3 JDBC statements;
        650000 nanoseconds spent executing 3 JDBC statements;
        0 nanoseconds spent executing 0 JDBC batches;
        0 nanoseconds spent performing 0 L2C puts;
        0 nanoseconds spent performing 0 L2C hits;
        0 nanoseconds spent performing 0 L2C misses;
        0 nanoseconds spent executing 0 flushes (flushing a total of 0 entities and 0 collections);
        0 nanoseconds spent executing 0 partial-flushes (flushing a total of 0 entities and 0 collections)
    }
    2019-08-31 15:21:00.241  INFO 18872 --- [           main] o.s.t.c.transaction.TransactionContext   : Rolled back transaction for test context [DefaultTestContext@393671df testClass = StudentRepositoryTest, testInstance = com.pointgenesis.jpa.hibernate.demo.repository.StudentRepositoryTest@27da994b, testMethod = retrieveStudentAndPassportDetails@StudentRepositoryTest, testException = [null], mergedContextConfiguration = [WebMergedContextConfiguration@56620197 testClass = StudentRepositoryTest, locations = '{}', classes = '{class com.pointgenesis.jpa.hibernate.demo.DemoApplication, class com.pointgenesis.jpa.hibernate.demo.DemoApplication}', contextInitializerClasses = '[]', activeProfiles = '{}', propertySourceLocations = '{}', propertySourceProperties = '{org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true}', contextCustomizers = set[org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@ea1a8d5, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@30a3107a, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@3d921e20, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@60285225], resourceBasePath = 'src/main/webapp', contextLoader = 'org.springframework.boot.test.context.SpringBootContextLoader', parent = [null]], attributes = map['org.springframework.test.context.web.ServletTestExecutionListener.activateListener' -> true, 'org.springframework.test.context.web.ServletTestExecutionListener.populatedRequestContextHolder' -> true, 'org.springframework.test.context.web.ServletTestExecutionListener.resetRequestContextHolder' -> true]].
    2019-08-31 15:21:00.249  INFO 18872 --- [           main] o.s.t.c.transaction.TransactionContext   : Began transaction (1) for test context [DefaultTestContext@393671df testClass = StudentRepositoryTest, testInstance = com.pointgenesis.jpa.hibernate.demo.repository.StudentRepositoryTest@1cee2e10, testMethod = retrieveStudentAndCourses@StudentRepositoryTest, testException = [null], mergedContextConfiguration = [WebMergedContextConfiguration@56620197 testClass = StudentRepositoryTest, locations = '{}', classes = '{class com.pointgenesis.jpa.hibernate.demo.DemoApplication, class com.pointgenesis.jpa.hibernate.demo.DemoApplication}', contextInitializerClasses = '[]', activeProfiles = '{}', propertySourceLocations = '{}', propertySourceProperties = '{org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true}', contextCustomizers = set[org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@ea1a8d5, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@30a3107a, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@3d921e20, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@60285225], resourceBasePath = 'src/main/webapp', contextLoader = 'org.springframework.boot.test.context.SpringBootContextLoader', parent = [null]], attributes = map['org.springframework.test.context.web.ServletTestExecutionListener.activateListener' -> true, 'org.springframework.test.context.web.ServletTestExecutionListener.populatedRequestContextHolder' -> true, 'org.springframework.test.context.web.ServletTestExecutionListener.resetRequestContextHolder' -> true]]; transaction manager [org.springframework.orm.jpa.JpaTransactionManager@784d9bc]; rollback [true]
    Hibernate: 
        select
            student0_.id as id1_3_0_,
            student0_.name as name2_3_0_,
            student0_.passport_id as passport3_3_0_,
            courses1_.student_id as student_1_4_1_,
            course2_.id as course_i2_4_1_,
            course2_.id as id1_0_2_,
            course2_.created_on_date as created_2_0_2_,
            course2_.last_updated_date as last_upd3_0_2_,
            course2_.name as name4_0_2_ 
        from
            student student0_ 
        left outer join
            student_course courses1_ 
                on student0_.id=courses1_.student_id 
        left outer join
            course course2_ 
                on courses1_.course_id=course2_.id 
        where
            student0_.id=?
    2019-08-31 15:21:00.251 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [BIGINT] - [20001]
    2019-08-31 15:21:00.251 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicExtractor   : extracted value ([id1_0_2_] : [BIGINT]) - [10001]
    2019-08-31 15:21:00.252 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicExtractor   : extracted value ([name2_3_0_] : [VARCHAR]) - [Don]
    2019-08-31 15:21:00.252 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicExtractor   : extracted value ([passport3_3_0_] : [BIGINT]) - [40001]
    2019-08-31 15:21:00.252 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicExtractor   : extracted value ([created_2_0_2_] : [TIMESTAMP]) - [2019-08-31T15:20:57.158]
    2019-08-31 15:21:00.252 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicExtractor   : extracted value ([last_upd3_0_2_] : [TIMESTAMP]) - [2019-08-31T15:20:59.610]
    2019-08-31 15:21:00.252 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicExtractor   : extracted value ([name4_0_2_] : [VARCHAR]) - [How to shoot a bear with a Bear]
    2019-08-31 15:21:00.253 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicExtractor   : extracted value ([student_1_4_1_] : [BIGINT]) - [20001]
    2019-08-31 15:21:00.253 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicExtractor   : extracted value ([course_i2_4_1_] : [BIGINT]) - [10001]
    2019-08-31 15:21:00.253 TRACE 18872 --- [           main] org.hibernate.type.CollectionType        : Created collection wrapper: [com.pointgenesis.jpa.hibernate.demo.entity.Course.reviews#10001]
    2019-08-31 15:21:00.253 TRACE 18872 --- [           main] org.hibernate.type.CollectionType        : Created collection wrapper: [com.pointgenesis.jpa.hibernate.demo.entity.Course.students#10001]
    Hibernate: 
        select
            passport0_.id as id1_1_0_,
            passport0_.number as number2_1_0_ 
        from
            passport passport0_ 
        where
            passport0_.id=?
    Hibernate: 
        select
            student0_.id as id1_3_1_,
            student0_.name as name2_3_1_,
            student0_.passport_id as passport3_3_1_,
            courses1_.student_id as student_1_4_3_,
            course2_.id as course_i2_4_3_,
            course2_.id as id1_0_0_,
            course2_.created_on_date as created_2_0_0_,
            course2_.last_updated_date as last_upd3_0_0_,
            course2_.name as name4_0_0_ 
        from
            student student0_ 
        left outer join
            student_course courses1_ 
                on student0_.id=courses1_.student_id 
        left outer join
            course course2_ 
                on courses1_.course_id=course2_.id 
        where
            student0_.passport_id=?
    2019-08-31 15:21:00.254  INFO 18872 --- [           main] c.p.j.h.d.r.StudentRepositoryTest        : Student -> Student [id=20001, name=Don, passport=Passport [id=40001, number=E123456789]]
    2019-08-31 15:21:00.256  INFO 18872 --- [           main] c.p.j.h.d.r.StudentRepositoryTest        : Courses -> [Course [id=10001, name=How to shoot a bear with a Bear]]
    2019-08-31 15:21:00.258  INFO 18872 --- [           main] i.StatisticalLoggingSessionEventListener : Session Metrics {
        22100 nanoseconds spent acquiring 1 JDBC connections;
        0 nanoseconds spent releasing 0 JDBC connections;
        105900 nanoseconds spent preparing 3 JDBC statements;
        273200 nanoseconds spent executing 3 JDBC statements;
        0 nanoseconds spent executing 0 JDBC batches;
        0 nanoseconds spent performing 0 L2C puts;
        0 nanoseconds spent performing 0 L2C hits;
        0 nanoseconds spent performing 0 L2C misses;
        0 nanoseconds spent executing 0 flushes (flushing a total of 0 entities and 0 collections);
        0 nanoseconds spent executing 0 partial-flushes (flushing a total of 0 entities and 0 collections)
    }
    2019-08-31 15:21:00.259  INFO 18872 --- [           main] o.s.t.c.transaction.TransactionContext   : Rolled back transaction for test context [DefaultTestContext@393671df testClass = StudentRepositoryTest, testInstance = com.pointgenesis.jpa.hibernate.demo.repository.StudentRepositoryTest@1cee2e10, testMethod = retrieveStudentAndCourses@StudentRepositoryTest, testException = [null], mergedContextConfiguration = [WebMergedContextConfiguration@56620197 testClass = StudentRepositoryTest, locations = '{}', classes = '{class com.pointgenesis.jpa.hibernate.demo.DemoApplication, class com.pointgenesis.jpa.hibernate.demo.DemoApplication}', contextInitializerClasses = '[]', activeProfiles = '{}', propertySourceLocations = '{}', propertySourceProperties = '{org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true}', contextCustomizers = set[org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@ea1a8d5, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@30a3107a, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@3d921e20, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@60285225], resourceBasePath = 'src/main/webapp', contextLoader = 'org.springframework.boot.test.context.SpringBootContextLoader', parent = [null]], attributes = map['org.springframework.test.context.web.ServletTestExecutionListener.activateListener' -> true, 'org.springframework.test.context.web.ServletTestExecutionListener.populatedRequestContextHolder' -> true, 'org.springframework.test.context.web.ServletTestExecutionListener.resetRequestContextHolder' -> true]].
    2019-08-31 15:21:00.261  INFO 18872 --- [           main] o.s.t.c.transaction.TransactionContext   : Began transaction (1) for test context [DefaultTestContext@393671df testClass = StudentRepositoryTest, testInstance = com.pointgenesis.jpa.hibernate.demo.repository.StudentRepositoryTest@10fb4575, testMethod = retrievePassportAndStudentDetails@StudentRepositoryTest, testException = [null], mergedContextConfiguration = [WebMergedContextConfiguration@56620197 testClass = StudentRepositoryTest, locations = '{}', classes = '{class com.pointgenesis.jpa.hibernate.demo.DemoApplication, class com.pointgenesis.jpa.hibernate.demo.DemoApplication}', contextInitializerClasses = '[]', activeProfiles = '{}', propertySourceLocations = '{}', propertySourceProperties = '{org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true}', contextCustomizers = set[org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@ea1a8d5, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@30a3107a, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@3d921e20, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@60285225], resourceBasePath = 'src/main/webapp', contextLoader = 'org.springframework.boot.test.context.SpringBootContextLoader', parent = [null]], attributes = map['org.springframework.test.context.web.ServletTestExecutionListener.activateListener' -> true, 'org.springframework.test.context.web.ServletTestExecutionListener.populatedRequestContextHolder' -> true, 'org.springframework.test.context.web.ServletTestExecutionListener.resetRequestContextHolder' -> true]]; transaction manager [org.springframework.orm.jpa.JpaTransactionManager@784d9bc]; rollback [true]
    2019-08-31 15:21:00.262  INFO 18872 --- [           main] c.p.j.h.d.r.StudentRepositoryTest        : retrievePassportAndStudentDetails is running.
    Hibernate: 
        select
            passport0_.id as id1_1_0_,
            passport0_.number as number2_1_0_ 
        from
            passport passport0_ 
        where
            passport0_.id=?
    2019-08-31 15:21:00.263 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [BIGINT] - [40001]
    2019-08-31 15:21:00.263 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicExtractor   : extracted value ([number2_1_0_] : [VARCHAR]) - [E123456789]
    Hibernate: 
        select
            student0_.id as id1_3_1_,
            student0_.name as name2_3_1_,
            student0_.passport_id as passport3_3_1_,
            courses1_.student_id as student_1_4_3_,
            course2_.id as course_i2_4_3_,
            course2_.id as id1_0_0_,
            course2_.created_on_date as created_2_0_0_,
            course2_.last_updated_date as last_upd3_0_0_,
            course2_.name as name4_0_0_ 
        from
            student student0_ 
        left outer join
            student_course courses1_ 
                on student0_.id=courses1_.student_id 
        left outer join
            course course2_ 
                on courses1_.course_id=course2_.id 
        where
            student0_.passport_id=?
    2019-08-31 15:21:00.264 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [BIGINT] - [40001]
    2019-08-31 15:21:00.264 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicExtractor   : extracted value ([id1_0_0_] : [BIGINT]) - [10001]
    2019-08-31 15:21:00.264 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicExtractor   : extracted value ([id1_3_1_] : [BIGINT]) - [20001]
    2019-08-31 15:21:00.264 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicExtractor   : extracted value ([created_2_0_0_] : [TIMESTAMP]) - [2019-08-31T15:20:57.158]
    2019-08-31 15:21:00.265 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicExtractor   : extracted value ([last_upd3_0_0_] : [TIMESTAMP]) - [2019-08-31T15:20:59.610]
    2019-08-31 15:21:00.265 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicExtractor   : extracted value ([name4_0_0_] : [VARCHAR]) - [How to shoot a bear with a Bear]
    2019-08-31 15:21:00.265 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicExtractor   : extracted value ([name2_3_1_] : [VARCHAR]) - [Don]
    2019-08-31 15:21:00.265 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicExtractor   : extracted value ([passport3_3_1_] : [BIGINT]) - [40001]
    2019-08-31 15:21:00.265 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicExtractor   : extracted value ([student_1_4_3_] : [BIGINT]) - [20001]
    2019-08-31 15:21:00.265 TRACE 18872 --- [           main] o.h.type.descriptor.sql.BasicExtractor   : extracted value ([course_i2_4_3_] : [BIGINT]) - [10001]
    2019-08-31 15:21:00.265 TRACE 18872 --- [           main] org.hibernate.type.CollectionType        : Created collection wrapper: [com.pointgenesis.jpa.hibernate.demo.entity.Course.reviews#10001]
    2019-08-31 15:21:00.265 TRACE 18872 --- [           main] org.hibernate.type.CollectionType        : Created collection wrapper: [com.pointgenesis.jpa.hibernate.demo.entity.Course.students#10001]
    2019-08-31 15:21:00.266  INFO 18872 --- [           main] c.p.j.h.d.r.StudentRepositoryTest        : Student: Student [id=20001, name=Don, passport=Passport [id=40001, number=E123456789]]
    2019-08-31 15:21:00.266  INFO 18872 --- [           main] c.p.j.h.d.r.StudentRepositoryTest        : Passport: Passport [id=40001, number=E123456789]
    2019-08-31 15:21:00.268  INFO 18872 --- [           main] i.StatisticalLoggingSessionEventListener : Session Metrics {
        20800 nanoseconds spent acquiring 1 JDBC connections;
        0 nanoseconds spent releasing 0 JDBC connections;
        76700 nanoseconds spent preparing 2 JDBC statements;
        111700 nanoseconds spent executing 2 JDBC statements;
        0 nanoseconds spent executing 0 JDBC batches;
        0 nanoseconds spent performing 0 L2C puts;
        0 nanoseconds spent performing 0 L2C hits;
        0 nanoseconds spent performing 0 L2C misses;
        0 nanoseconds spent executing 0 flushes (flushing a total of 0 entities and 0 collections);
        0 nanoseconds spent executing 0 partial-flushes (flushing a total of 0 entities and 0 collections)
    }
    2019-08-31 15:21:00.268  INFO 18872 --- [           main] o.s.t.c.transaction.TransactionContext   : Rolled back transaction for test context [DefaultTestContext@393671df testClass = StudentRepositoryTest, testInstance = com.pointgenesis.jpa.hibernate.demo.repository.StudentRepositoryTest@10fb4575, testMethod = retrievePassportAndStudentDetails@StudentRepositoryTest, testException = [null], mergedContextConfiguration = [WebMergedContextConfiguration@56620197 testClass = StudentRepositoryTest, locations = '{}', classes = '{class com.pointgenesis.jpa.hibernate.demo.DemoApplication, class com.pointgenesis.jpa.hibernate.demo.DemoApplication}', contextInitializerClasses = '[]', activeProfiles = '{}', propertySourceLocations = '{}', propertySourceProperties = '{org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true}', contextCustomizers = set[org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@ea1a8d5, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@30a3107a, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@3d921e20, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@60285225], resourceBasePath = 'src/main/webapp', contextLoader = 'org.springframework.boot.test.context.SpringBootContextLoader', parent = [null]], attributes = map['org.springframework.test.context.web.ServletTestExecutionListener.activateListener' -> true, 'org.springframework.test.context.web.ServletTestExecutionListener.populatedRequestContextHolder' -> true, 'org.springframework.test.context.web.ServletTestExecutionListener.resetRequestContextHolder' -> true]].
    2019-08-31 15:21:00.299  INFO 18872 --- [       Thread-2] o.s.w.c.s.GenericWebApplicationContext   : Closing org.springframework.web.context.support.GenericWebApplicationContext@21282ed8: startup date [Sat Aug 31 15:20:49 EDT 2019]; root of context hierarchy
    2019-08-31 15:21:00.303  INFO 18872 --- [       Thread-2] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
    2019-08-31 15:21:00.304  INFO 18872 --- [       Thread-2] .SchemaDropperImpl$DelayedDropActionImpl : HHH000477: Starting delayed drop of schema as part of SessionFactory shut-down'
    Hibernate: 

        drop table course if exists
    Hibernate: 

        drop table passport if exists
    Hibernate: 

        drop table review if exists
    Hibernate: 

        drop table student if exists
    Hibernate: 

        drop table student_course if exists
    Hibernate: 

        drop sequence if exists hibernate_sequence
    2019-08-31 15:21:00.315  INFO 18872 --- [       Thread-2] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
    2019-08-31 15:21:00.320  INFO 18872 --- [       Thread-2] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.

