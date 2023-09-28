import './App.css'
import Main from './components/Main'

function App() {
  /* Crear un Componente Main el cual llame dos veces a un mismo componente, es decir, 
que Main anide a Hijo e Hijo.  
• Index.js 
o App 
§ Main 
• Hijo 
• Hijo 
Al primer Componente anidado pasarle como props el nombre Chiquito y al segundo el 
nombre Filomena. Desde los componentes Hijos atrapar los valores mediante las props. */
  return (
    <>
      <Main></Main>
    </>
  )
}

export default App
