import './App.css'
import Footer from './components/Footer'
import Main from './components/Main'
import Navbar from './components/Navbar'

function App() {
  /* 
    Crear un proyecto compuesto por tres componentes bajo la misma jerarquía. Crear un 
Navbar, Main y Footer. 
• Index.js 
  o App 
    § Navbar 
    § Main 
    § Footer 
Necesitamos hacer que Footer, Main y Navbar muestren al menos un dato, de la misma 
manera que el ejercicio anterior.
  */
  return (
    <>
      <Navbar/>
      <Main/>
      <Footer/>
    </>
  )
}

export default App
