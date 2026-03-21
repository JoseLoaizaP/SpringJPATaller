-- ---------------------------------------------------------
-- USERS (20 usuarios base para soportar Admin, Trainer, Student y User normal)
-- progress_id se deja NULL al inicio por la referencia circular con user_progress
-- ---------------------------------------------------------
INSERT INTO users (id, full_name, birth_date, weight, height, password, progress_id) VALUES
(1,  'Admin Uno',        '1985-01-10', 80.0, 1.80, 'admin123', NULL),
(2,  'Admin Dos',        '1987-03-15', 78.0, 1.76, 'admin123', NULL),
(3,  'Admin Tres',       '1983-07-21', 82.0, 1.82, 'admin123', NULL),
(4,  'Admin Cuatro',     '1990-09-12', 75.0, 1.74, 'admin123', NULL),
(5,  'Admin Cinco',      '1988-11-05', 79.0, 1.79, 'admin123', NULL),

(6,  'Trainer Uno',      '1992-02-11', 72.0, 1.73, 'train123', NULL),
(7,  'Trainer Dos',      '1991-04-17', 74.0, 1.75, 'train123', NULL),
(8,  'Trainer Tres',     '1993-06-23', 76.0, 1.78, 'train123', NULL),
(9,  'Trainer Cuatro',   '1994-08-09', 70.0, 1.70, 'train123', NULL),
(10, 'Trainer Cinco',    '1990-12-30', 77.0, 1.81, 'train123', NULL),

(11, 'Student Uno',      '2000-01-01', 65.0, 1.68, 'stud123', NULL),
(12, 'Student Dos',      '2001-02-02', 67.0, 1.70, 'stud123', NULL),
(13, 'Student Tres',     '1999-03-03', 69.0, 1.72, 'stud123', NULL),
(14, 'Student Cuatro',   '2002-04-04', 64.0, 1.66, 'stud123', NULL),
(15, 'Student Cinco',    '2000-05-05', 71.0, 1.74, 'stud123', NULL),

(16, 'User Uno',         '1998-06-06', 68.0, 1.71, 'user123', NULL),
(17, 'User Dos',         '1997-07-07', 73.0, 1.77, 'user123', NULL),
(18, 'User Tres',        '1996-08-08', 66.0, 1.69, 'user123', NULL),
(19, 'User Cuatro',      '1995-09-09', 75.0, 1.80, 'user123', NULL),
(20, 'User Cinco',       '1994-10-10', 70.0, 1.73, 'user123', NULL);

-- ---------------------------------------------------------
-- ADMINS
-- ---------------------------------------------------------
INSERT INTO admins (user_id) VALUES
(1), (2), (3), (4), (5);

-- ---------------------------------------------------------
-- TRAINERS
-- ---------------------------------------------------------
INSERT INTO trainers (user_id) VALUES
(6), (7), (8), (9), (10);

-- ---------------------------------------------------------
-- STUDENTS
-- ---------------------------------------------------------
INSERT INTO students (user_id, trainer_id) VALUES
(11, 6),
(12, 7),
(13, 8),
(14, 9),
(15, 10);

-- ---------------------------------------------------------
-- USER_PROGRESS
-- user_id referencia a users
-- ---------------------------------------------------------
INSERT INTO user_progress (id, date, effort_level, notes, past_weight, current_weight, user_id) VALUES
(1, '2026-03-01 08:00:00', 'HIGH',   'Excelente progreso semanal', 70, 68, 16),
(2, '2026-03-02 08:00:00', 'MEDIUM', 'Mejorando resistencia',      76, 74, 17),
(3, '2026-03-03 08:00:00', 'LOW',    'Semana ligera',              68, 66, 18),
(4, '2026-03-04 08:00:00', 'HIGH',   'Muy buen rendimiento',       78, 75, 19),
(5, '2026-03-05 08:00:00', 'MEDIUM', 'Manteniendo constancia',     72, 70, 20);

-- ---------------------------------------------------------
-- PERMISSION
-- ---------------------------------------------------------
INSERT INTO permission (id, code) VALUES
(1, 100),
(2, 200),
(3, 300),
(4, 400),
(5, 500);

-- ---------------------------------------------------------
-- RECOMENDATION
-- ---------------------------------------------------------
INSERT INTO recomendation (id, description) VALUES
(1, 'Aumentar consumo de agua diariamente'),
(2, 'Realizar estiramientos despues del entrenamiento'),
(3, 'Dormir al menos 7 horas por noche'),
(4, 'Incrementar progresivamente la intensidad'),
(5, 'Llevar registro semanal del peso');

-- ---------------------------------------------------------
-- EXERCISE
-- ---------------------------------------------------------
INSERT INTO exercise (id, name, type, description, duration, difficulty, video_url) VALUES
(1, 'Sentadillas',      'Strength',   'Ejercicio para piernas y gluteos',        15, 'Medium', 'https://video.com/sentadillas'),
(2, 'Flexiones',        'Strength',   'Ejercicio para pecho y brazos',           10, 'Medium', 'https://video.com/flexiones'),
(3, 'Plancha',          'Core',       'Ejercicio isometrico abdominal',           5, 'Hard',   'https://video.com/plancha'),
(4, 'Burpees',          'Cardio',     'Ejercicio de cuerpo completo',            12, 'Hard',   'https://video.com/burpees'),
(5, 'Trote Suave',      'Endurance',  'Cardio de baja intensidad',               30, 'Easy',   'https://video.com/trote');

-- ---------------------------------------------------------
-- SESION
-- ---------------------------------------------------------
INSERT INTO sesion (id, date, duration, user_id) VALUES
(1, '2026-03-10 06:00:00', 60, 16),
(2, '2026-03-11 07:00:00', 45, 17),
(3, '2026-03-12 08:00:00', 50, 18),
(4, '2026-03-13 09:00:00', 70, 19),
(5, '2026-03-14 10:00:00', 55, 20);

-- ---------------------------------------------------------
-- ROUTINE
-- ---------------------------------------------------------
INSERT INTO routine (id, routine_name, description, visibility, sesion_id, user_id, trainer_id) VALUES
(1, 'Rutina Pierna',    'Enfoque en fuerza de tren inferior',   'PUBLIC',  1, 16, 6),
(2, 'Rutina Pecho',     'Trabajo de empuje y resistencia',      'PRIVATE', 2, 17, 7),
(3, 'Rutina Core',      'Abdomen y estabilidad',                'PUBLIC',  3, 18, 8),
(4, 'Rutina HIIT',      'Cardio de alta intensidad',            'PRIVATE', 4, 19, 9),
(5, 'Rutina FullBody',  'Trabajo general del cuerpo',           'PUBLIC',  5, 20, 10);

-- ---------------------------------------------------------
-- EXERCISES_IN_ROUTINE
-- ---------------------------------------------------------
INSERT INTO exercises_in_routine (id, exercise_id, routine_id) VALUES
(1, 1, 1),
(2, 2, 2),
(3, 3, 3),
(4, 4, 4),
(5, 5, 5);

-- ---------------------------------------------------------
-- STATS
-- ---------------------------------------------------------
INSERT INTO stats (id, time, ammount_exercises, user_id) VALUES
(1, 3600, 4, 16),
(2, 2700, 3, 17),
(3, 3000, 5, 18),
(4, 4200, 6, 19),
(5, 3300, 4, 20);

-- ---------------------------------------------------------
-- EXERCISE_STATS
-- ---------------------------------------------------------
INSERT INTO exercise_stats (id, stats_id, exercise_id) VALUES
(1, 1, 1),
(2, 2, 2),
(3, 3, 3),
(4, 4, 4),
(5, 5, 5);

-- ---------------------------------------------------------
-- EVENT
-- admin_id referencia users (admins son users)
-- ---------------------------------------------------------
INSERT INTO event (id, title, place, date, admin_id) VALUES
(1, 'Clase Funcional',      'Salon A',  '2026-03-20 08:00:00', 1),
(2, 'Maraton Interna',      'Pista',    '2026-03-21 06:00:00', 2),
(3, 'Taller de Nutricion',  'Salon B',  '2026-03-22 10:00:00', 3),
(4, 'Sesion de Yoga',       'Terraza',  '2026-03-23 07:00:00', 4),
(5, 'Evaluacion Fisica',    'Consult.', '2026-03-24 09:00:00', 5);

-- ---------------------------------------------------------
-- USER_PARTICIPATION
-- Si esta tabla falla, el problema está en tu entidad, no en los inserts.
-- ---------------------------------------------------------
INSERT INTO user_participation (id, user_id, event_id) VALUES
(1, 16, 1),
(2, 17, 2),
(3, 18, 3),
(4, 19, 4),
(5, 20, 5);

-- ---------------------------------------------------------
-- USER_PERMISSION
-- ---------------------------------------------------------
INSERT INTO user_permission (id, user_id, permission_id) VALUES
(1, 1, 1),
(2, 6, 2),
(3, 11, 3),
(4, 16, 4),
(5, 17, 5);

-- ---------------------------------------------------------
-- USER_RECOMENDATION
-- ---------------------------------------------------------
INSERT INTO user_recomendation (id, user_id, recomendation_id) VALUES
(1, 16, 1),
(2, 17, 2),
(3, 18, 3),
(4, 19, 4),
(5, 20, 5);

-- ---------------------------------------------------------
-- MESSAGE
-- notification se deja NULL al inicio por la referencia circular
-- ---------------------------------------------------------
INSERT INTO message (id, content, sender_user_id, receiver_user_id, notification) VALUES
(1, 'Recuerda hidratarte hoy',          6, 16, NULL),
(2, 'Buen trabajo en la sesion',        7, 17, NULL),
(3, 'Debes mejorar la tecnica',         8, 18, NULL),
(4, 'Excelente progreso esta semana',   9, 19, NULL),
(5, 'No olvides tu rutina de manana',  10, 20, NULL);

-- ---------------------------------------------------------
-- NOTIFICATION
-- ---------------------------------------------------------
INSERT INTO notification (id, reference_id, type, user_id, message_id) VALUES
(1, 101, 'MESSAGE', 16, 1),
(2, 102, 'MESSAGE', 17, 2),
(3, 103, 'MESSAGE', 18, 3),
(4, 104, 'MESSAGE', 19, 4),
(5, 105, 'MESSAGE', 20, 5);

-- ---------------------------------------------------------
-- UPDATES para cerrar referencias circulares
-- ---------------------------------------------------------
UPDATE users SET progress_id = 1 WHERE id = 16;
UPDATE users SET progress_id = 2 WHERE id = 17;
UPDATE users SET progress_id = 3 WHERE id = 18;
UPDATE users SET progress_id = 4 WHERE id = 19;
UPDATE users SET progress_id = 5 WHERE id = 20;

UPDATE message SET notification = 1 WHERE id = 1;
UPDATE message SET notification = 2 WHERE id = 2;
UPDATE message SET notification = 3 WHERE id = 3;
UPDATE message SET notification = 4 WHERE id = 4;
UPDATE message SET notification = 5 WHERE id = 5;