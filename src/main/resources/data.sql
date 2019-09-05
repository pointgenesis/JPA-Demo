insert into course(id, name, last_updated_date, created_on_date) values (10001, 'JPA in 50 Steps', sysdate(), sysdate());
insert into course(id, name, last_updated_date, created_on_date) values (10002, 'JPA in 100 Steps', sysdate(), sysdate());
insert into course(id, name, last_updated_date, created_on_date) values (10003, 'JPA in 150 Steps', sysdate(), sysdate());

insert into passport(id, number) values (40001, 'E123456789');
insert into passport(id, number) values (40002, 'E211454212');
insert into passport(id, number) values (40003, 'E195476755');
insert into passport(id, number) values (40004, 'E519872143');

insert into review(id, rating, description, course_id) values(50001, '5', 'Great Course', 10001); 
insert into review(id, rating, description, course_id) values(50002, '4', 'Good Course', 10001);
insert into review(id, rating, description, course_id) values(50003, '3', 'Average Course', 10001);
insert into review(id, rating, description, course_id) values(50004, '2', 'Below Average Course', 10003);
insert into review(id, rating, description, course_id) values(50005, '1', 'Poor Course', 10001);
insert into review(id, rating, description, course_id) values(50006, '0', 'Brain Fart', 10003);

insert into student(id, name, passport_id) values (20001, 'Don', 40001);
insert into student(id, name, passport_id) values (20002, 'Tom', 40002);
insert into student(id, name, passport_id) values (20003, 'Maz', 40003);
insert into student(id, name, passport_id) values (20004, 'Tim', 40004);

insert into student_course(student_id, course_id) values(20001, 10001);
insert into student_course(student_id, course_id) values(20002, 10001);
insert into student_course(student_id, course_id) values(20003, 10001);
insert into student_course(student_id, course_id) values(20004, 10003);
-- insert into student_course(student_id, course_id) values();
-- insert into student_course(student_id, course_id) values();