$(document).ready(function() {
// on ready
});

async function RegistrarUsuario(){

   let datos = {};
     datos.nombre = document.getElementById('txtNombre').value;
     datos.apellido = document.getElementById('txtApellido').value;
     datos.email = document.getElementById('txtEmail').value;
     datos.password = document.getElementById('txtPassword').value;
     datos.direccion = document.getElementById('direccion').value;

     console.log(datos)

     let repetirPassword = document.getElementById('txtRepetirPassword').value;

     if(repetirPassword != datos.password){
     alert('La contraseña no coincide');
     return;
     }

      const request = await fetch('api/usuarios', {
        method: 'POST',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
      });

    alert("La cuenta fue creada con exito!")
    window.location.href = 'login.html'
}
