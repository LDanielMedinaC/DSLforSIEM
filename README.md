<!--
*** Thanks for checking out this README Template. If you have a suggestion that would
*** make this better please fork the repo and create a pull request or simple open
*** an issue with the tag "enhancement".
*** Thanks again! Now go create something AMAZING! :D
-->


<!-- PROJECT SHIELDS -->
[![Build Status][build-shield]]()
[![Contributors][contributors-shield]]()
[![MIT License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]

<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://github.com/LDanielMedinaC/DSLforSIEM">
    <img src="logo.png" alt="Logo" width="80" height="80">
  </a>

  <h3 align="center">DSL para un SIEM</h3>

  <p align="center">
    Un Lenguaje de Dominio Especifico para un SIEM
    <br />
    <a href="https://github.com/LDanielMedinaC/DSLforSIEM"><strong>Explora la documentacion</strong></a>
    <br />
    <br />
    <a href="https://github.com/LDanielMedinaC/DSLforSIEM">Ve el Demo</a>
    ·
    <a href="https://github.com/LDanielMedinaC/DSLforSIEM">Reporta un Bug</a>
    ·
    <a href="https://github.com/LDanielMedinaC/DSLforSIEM">Pide una mejora</a>
  </p>
</p>



<!-- TABLE OF CONTENTS -->
## Tabla de Contenidos

* [Acerca del Proyecto](#about-the-project)
  * [Construído con](#built-with)
* [Primeros Pasos](#getting-started)
  * [Pre-Requisitos](#prerequisites)
  * [Instalación](#installation)
* [Uso](#usage)
* [Contribución](#contributing)
* [Licencia](#license)
* [Contacto](#contact)
* [Colaboradores](#acknowledgements)



<!-- ABOUT THE PROJECT -->
## About The Project

[![Product Name Screen Shot][product-screenshot]](https://github.com/LDanielMedinaC/DSLforSIEM)

Este es un proyecto basado en el artículo [A High-Level Domain-specific Language for SIEM (Design, Development and
Formal Verification)](https://s3.us-east-1.amazonaws.com/blackboard.learn.xythos.prod/5a31b9b8c288e/23757505?response-content-disposition=inline%3B%20filename%2A%3DUTF-8%27%27springer1.pdf&response-content-type=application%2Fpdf&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20190511T235004Z&X-Amz-SignedHeaders=host&X-Amz-Expires=21600&X-Amz-Credential=AKIAIL7WQYDOOHAZJGWQ%2F20190511%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Signature=d6acc59c996b096c15c183d67d74fab6b5b47b9928eee707ec759562564d784d)el cual buscaba generar un lenguaje de dominio específico para un [SIEM](https://en.wikipedia.org/wiki/Security_information_and_event_management) que fuese capaz de convertir lenguaje común y corriente y convertirlo para ser ejecutado en uno de estos sistemas. 

Nuestro proyecto realiza una acercación al trabajo realizado en el artículo y puede traducir sentencias en lenguaje natural a:

* Reglas para reconocer ataques DOS
* Reglas para reconocer ataques de login
* Reglas de ataque de Firewall

Todas las reglas empiezan por la sentencia: **'If there are more than'** y siguen de la siguiente manera:
* **MORE_THAN** 'requests in less than' **limit** 'with the IP address' **IP**;  
* **MORE_THAN** 'failed login' **limit** 'with the same' **ACCOUNT**;
* **MORE_THAN** 'firewall' **DENY_WORDS** 'in less than' **limit**;

Donde:
* **IP** : Es una dirección IP provista por el usuario
* **limit** : Es el lapso de tiempo de la regla
* **ACCOUNT** : Es la cuenta de correo de un usuario en la red
* **DENY_WORDS** : Son palabras de rechazo aceptadas por el SIEM tales como: drop, reject, deny



### Built With
Este proyecto fue construido usando las siguientes herramientas:
* [ANTLR 4](https://www.antlr.org)
* [Java](https://www.java.com/download/)


<!-- GETTING STARTED -->
## Getting Started

Para poder crear un entorno de desarrollo de ANTLR 4
### Prerequisites

This is an example of how to list things you need to use the software and how to install them.
* npm
```sh
npm install npm@latest -g
```

### Installation

1. Get a free API Key at [https://example.com](https://example.com)
2. Clone the repo
```sh
git clone https:://github.com/your_username_/Project-Name.git
```
3. Install NPM packages
```sh
npm install
```
4. Enter your API in `config.js`
```JS
const API_KEY = 'ENTER YOUR API';
```



<!-- USAGE EXAMPLES -->
## Usage

Use this space to show useful examples of how a project can be used. Additional screenshots, code examples and demos work well in this space. You may also link to more resources.

_For more examples, please refer to the [Documentation](https://example.com)_



<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request



<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE` for more information.



<!-- CONTACT -->
## Contact

Equipo 2 - [@your_twitter](https://twitter.com/your_username) - email@example.com

Project Link: [https://github.com/LDanielMedinaC/DSLforSIEM](https://github.com/LDanielMedinaC/DSLforSIEM)



<!-- ACKNOWLEDGEMENTS -->
## Acknowledgements
* [GitHub Emoji Cheat Sheet](https://www.webpagefx.com/tools/emoji-cheat-sheet)
* [Img Shields](https://shields.io)
* [Choose an Open Source License](https://choosealicense.com)
* [GitHub Pages](https://pages.github.com)
* [Animate.css](https://daneden.github.io/animate.css)
* [Loaders.css](https://connoratherton.com/loaders)
* [Slick Carousel](https://kenwheeler.github.io/slick)
* [Smooth Scroll](https://github.com/cferdinandi/smooth-scroll)
* [Sticky Kit](http://leafo.net/sticky-kit)
* [JVectorMap](http://jvectormap.com)
* [Font Awesome](https://fontawesome.com)





<!-- MARKDOWN LINKS & IMAGES -->
[build-shield]: https://img.shields.io/badge/build-passing-brightgreen.svg?style=flat-square
[contributors-shield]: https://img.shields.io/badge/contributors-1-orange.svg?style=flat-square
[license-shield]: https://img.shields.io/badge/license-MIT-blue.svg?style=flat-square
[license-url]: https://choosealicense.com/licenses/mit
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=flat-square&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/othneildrew
[product-screenshot]: https://raw.githubusercontent.com/othneildrew/Best-README-Template/master/screenshot.png
