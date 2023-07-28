import { Component } from 'react';
import '../navbar/nav.css';
import logo from '../navbar/logotrans.png';
import logo1 from '../navbar/backgroung.jpeg';


class Navbar extends Component{
    state={clicked: false}
    handleClick = ()=>{
        this.setState({clicked:!this.state.clicked})
    }
    render(){

    return(
        <>
            <nav>
                <div className=' Navbar'>
                <img src={logo} width={200} height={70}/>
                </div>
                <div>
                    <ul id='navbar' className={this.state.clicked ? "#navbar active" : "#navbar"}>       
                        <li><a className="active"
                            href="/HOME">Home</a></li>
                        <li><a href="/MYBOOKINGS">MY BOOKINGS</a></li>
                        <li><a href="/DOWNLOAD">DOWNLOAD</a></li>
                        <li><a href="/FAQ">SUPPORT</a></li>
                        <li><a href="ABOUT">ABOUT</a></li>
                        <li><a href="/LOGIN">LOGIN</a></li>
                        <li><a href="/PROFILE">PROFILE</a></li>

                    </ul>
                </div>
                <div id='mobile' onClick={this.handleClick}>
                    <i if="bar"
                     className={this.state.clicked ?
                    'fas fa-times' : 
                    'fas fa-bars'} ></i>

                </div>
            </nav>
            <div className='main'>
                <div className='background'> 
                <img src={logo1} width={1440} height={800}/>
                </div>
            </div>
        </>
    )
}
}
export default Navbar;