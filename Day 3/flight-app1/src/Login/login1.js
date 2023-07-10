import React from 'react';
import '../Login/login1.css';

const LoginSignup = () => {
var log = document.getElementById("login");
var sign = document.getElementById("signup");
var button = document.getElementById("btn");
  const login = () => {
    log.style.left = "50px";
    sign.style.left = "450px";
    button.style.left = "0px";
  };

  const signup = () => {
  log.style.left = "-400px";
  sign.style.left = "50px";
  button.style.left = "110px";
  };

  return (
    <div className="hero">
      <div className="form-box">
        <div className="button-box">
          <div id="btn"></div>
          <button type="button" className="toggle-btn" onClick={login}>
            Login
          </button>
          <button type="button" className="toggle-btn" onClick={signup}>
            Signup
          </button>
        </div>
        <div className="social-icons">
          <img src="https://www.facebook.com/images/fb_icon_325x325.png" alt="facebook" />
          <img src="https://upload.wikimedia.org/wikipedia/commons/5/53/Google_%22G%22_Logo.svg" alt="instagram" />
          <img src="https://cdn-icons-png.flaticon.com/512/226/226235.png?w=1380&t=st=1688971677~exp=1688972277~hmac=2b9e25f6f950f7f5b49a891cd1e85f2f730aad8cc6db07e93f2158a48f966402" alt="twitter" />
        </div>
        <form id="login" className="input-group">
          <input
            type="text"
            className="input-field"
            placeholder="Username"
            required
          />
          <input
            type="password"
            className="input-field"
            placeholder="Password"
            required
          />
          <input type="checkbox" className="check-box" />
          <span>Remember Password</span>
          <button type="submit" className="submit-btn" onClick={login}>
            Log in
          </button>
        </form>
        <form id="signup" className="input-group">
          <input
            type="text"
            className="input-field"
            placeholder="Username"
            required
          />
          <input
            type="email"
            className="input-field"
            placeholder="Email Id"
            required
          />
          <input
            type="tel"
            className="input-field"
            placeholder="Phone Number"
            required
          />
          <input
            type="password"
            className="input-field"
            placeholder="Password"
            required
          />
          <input
            type="Confirm password"
            className="input-field"
            placeholder="Confirm Password"
            required
          />
          <input type="checkbox" className="check-box" />
          <span>I agree to the terms & conditions</span>
          <button type="submit" className="submit-btn" onClick={signup}>
            Signup
          </button>
        </form>
      </div>
    </div>
  );
};

export default LoginSignup;
