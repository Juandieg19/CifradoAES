# CifradoAES

Este repositorio contiene un ejemplo sencillo de cifrado simétrico utilizando el algoritmo **AES (Advanced Encryption Standard)** en Java. El objetivo es mostrar, de forma práctica, cómo se puede proteger información sensible mediante un criptosistema de **clave privada**, usando la misma clave tanto para cifrar como para descifrar los datos.

El ejemplo fue desarrollado en **NetBeans** como apoyo a una actividad académica de la asignatura *Seguridad en el Desarrollo de Software*, enfocada en el estudio de criptosistemas simétricos aplicados al sector financiero.

## Características del ejemplo

- Algoritmo de cifrado: **AES**.
- Tipo de cifrado: **simétrico (clave privada)**.
- Clave de ejemplo de 16 caracteres (AES-128), usada solo con fines didácticos.
- Demuestra el ciclo completo:
  - Texto original (información sensible simulada).
  - Cifrado del texto.
  - Descifrado utilizando la misma clave.

## Estructura del proyecto

- `src/` → Contiene el código fuente en Java.
- `nbproject/` → Archivos de configuración del proyecto de NetBeans.
- `manifest.mf` → Archivo de manifiesto generado por NetBeans.

## Requisitos

- **Java JDK 8** o superior.
- **NetBeans IDE** (o cualquier IDE compatible con proyectos Java).

## Cómo ejecutar el proyecto

1. Clonar o descargar este repositorio:
   ```bash
   git clone https://github.com/Juandieg19/CifradoAES.git
