INSERT INTO public.usuario(id, nombre_usuario, email, password)
VALUES
    (1, 'jose.perez', 'jose.perez@gmail.com', 'contrasena1'),
    (2, 'ana.rodriguez', 'ana.rodriguez@gmail.com', '1234abcd'),
    (3, 'juan.gonzalez', 'juan.gonzalez@gmail.com', 'p@$$w0rd'),
    (4, 'maria.sanchez', 'maria.sanchez@gmail.com', 'securePW'),
    (5, 'carlos.lopez', 'carlos.lopez@gmail.com', 'myPassword'),
    (6, 'laura.martinez', 'laura.martinez@gmail.com', 'pass123'),
    (7, 'pedro.gomez', 'pedro.gomez@gmail.com', 'qwerty123'),
    (8, 'isabel.flores', 'isabel.flores@gmail.com', 'secretPWD'),
    (9, 'felipe.fernandez', 'felipe.fernandez@gmail.com', 'secure1234'),
    (10, 'andrea.hernandez', 'andrea.hernandez@gmail.com', 'myPass@word');


INSERT INTO public.tarea(
    id_tarea, id_usuario, titulo, descripcion, fecha_vencimiento, estado)
VALUES
    (1, 1, 'Llamar al banco', 'Llamar al banco para verificar el estado del crédito.', '2023-11-15', 'Pendiente'),
    (2, 2, 'Comprar comida para la mascota', 'Comprar comida y juguetes para la mascota.', '2023-10-20', 'Completada'),
    (3, 3, 'Ir a retirar producto', 'Ir a la tienda a retirar un producto que encargué.', '2023-09-25', 'Completada'),
    (4, 4, 'Comprar regalo para un cumpleaños', 'Seleccionar un regalo para el cumpleaños de un amigo.', '2023-12-05', 'Pendiente'),
    (5, 5, 'Salida con amigos', 'Planificar una salida con amigos para el próximo fin de semana.', '2023-10-22', 'Pendiente'),
    (6, 6, 'Pedir hora al dentista', 'Llamar al dentista y pedir una cita para revisión.', '2023-11-10', 'Pendiente'),
    (7, 7, 'Cena de trabajo', 'Preparar una cena de trabajo con el equipo.', '2023-09-30', 'Completada'),
    (8, 8, 'Comprar freidora de aire', 'Investigar y comprar una freidora de aire para la cocina.', '2023-10-15', 'Pendiente'),
    (9, 9, 'Junta familiar', 'Organizar una junta familiar para el próximo sábado.', '2023-11-05', 'Pendiente'),
    (10, 10, 'Comprar utensilios de aseo', 'El fin de semana, comprar utensilios de aseo como cloro, jabón y paños de cocina.', '2023-09-18', 'Completada'),
    (11, 1, 'Enviar mail a ejecutivo', 'Enviar un correo electrónico al ejecutivo de la empresa.', '2023-10-25', 'Pendiente'),
    (12, 2, 'Revisar presentación', 'Revisar y corregir la presentación para la reunión de mañana.', '2023-10-11', 'Completada'),
    (13, 3, 'Comprar regalo para maria', 'Ir a la tienda del centro y comprar el regalo de cumpleaños de Maria.', '2023-12-02', 'Pendiente'),
    (14, 4, 'Llamar al dentista', 'Llamar al dentista para confirmar la cita de la próxima semana.', '2023-11-01', 'Pendiente'),
    (15, 5, 'Compra de víveres', 'Hacer una lista y comprar víveres para la semana.', '2023-10-14', 'Completada'),
    (16, 6, 'Planificar viaje', 'Planificar un viaje de fin de semana con la familia.', '2023-11-20', 'Pendiente'),
    (17, 7, 'Comprar boletos de cine', 'Comprar boletos para una película en el cine el viernes.', '2023-09-28', 'Completada'),
    (18, 8, 'Preparar informe', 'Preparar un informe para la reunión de mañana en la oficina.', '2023-10-10', 'Pendiente'),
    (19, 9, 'Revisar presupuesto', 'Revisar el presupuesto de gastos para el próximo mes.', '2023-10-30', 'Pendiente'),
    (20, 10, 'Organizar fiesta de cumpleaños', 'Planificar y organizar una fiesta de cumpleaños sorpresa.', '2023-11-15', 'Pendiente');
