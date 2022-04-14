import logo from './logo.svg';
import './App.css';

import CustomerRegistrationFinal from './Components/login and registration/CustomerRegistrationFinal';
import FarmerRegistrationFinal from './Components/login and registration/FarmerRegistrationFinal';
import HeaderComponent from './Components/Header/HeaderComponent';

import { BrowserRouter as Router, Routes, Route,Link} from 'react-router-dom'
import ErrorPage from './Components/ErrorPage';
import Home from './Components/Home/Home';
import About from './Components/Function components/About';
import Product from './Components/Products/Product';
import ContactUS from './Components/Function components/contactus';
import Footer from './Components/footer/Footer';
// import LoginFinal from './Components/login and registration/LoginFinal'; classcompo
// import LoginFinal from './Components/login and registration/LoginFunctionalComponent';
import LoginFunctionalComponent from './Components/login and registration/LoginFunctionalComponent';
import Admin from './Components/Admin/Admin';
import CustomerHome from './Components/CustomerHome';
import FarmerHome from './Components/FarmerHome';
import AllCustomers from './Components/Admin/AllCustomer';



// guide video for routing
// https://youtu.be/UjHT_NKR_gU

function App() {
  return (
       <HeaderComponent />
       //<AllCustomers></AllCustomers>
      )
}

export default App;
