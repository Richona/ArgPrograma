import './App.css'
import Footer from './components/Footer'
import Main1 from './components/Main1';
import Main2 from './components/Main2';
import Navbar from './components/Navbar'

import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';

function App() {
  /* 
  Crear un proyecto compuesto por 4 componentes bajo la siguiente jerarquía.  
• Index.js 
o App 
§ Navbar 
§ Main1 o Main2 
§ Footer 
Al  hacer  click  sobre  las  dos  posibles  opciones  en  el  NavBar,  se  deberá  cambiar  entre 
Main1  y  Main2  dependiendo  de  la  navegación.  Para  lograrlo  se  deberá  instalar  y  usar 
React Router Dom. 

   */

  return (
    <>
      <Router>
        <Navbar />

        <Routes>
          <Route path="/main1" element={<Main1 />} />
          <Route path="/main2" element={<Main2 />} />
        </Routes>

        <Footer />
      </Router>
    </>
  )
}

export default App
