import './App.css'
import Count from './components/Count'

function App() {
  /* 
  Crear un proyecto compuesto de un solo componente y hacer uso de useState y mostrar 
el state del componente.  
Se podrá crear un contador de clicks o crear un input que mediante onChange cambie 
el valor del state. Cualquiera de las dos opciones, son validas para este ejercicio.
  */
  
  return (
    <>
      <h1>Contador</h1>
      <Count/>
    </>
  )
}

export default App
