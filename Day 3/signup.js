import "../Login/signup.css";

function Signup() {
  return (
    <form class="login__form" method="POST" name="frm_login" action="#">
    <header class="login__header">
       <h1 class="login__title">SIGN UP</h1>
    </header>
    <main class="login__main">
    <div class="login__group">
          <input class="login__input" type="text" name="input_name" required/>
          <label class="login__label">Full Name</label>
          <div class="login__bar"></div>
       </div>
       <div class="login__group">
          <input class="login__input" type="text" name="input_email" required/>
          <label class="login__label">Email </label>
          <div class="login__bar"></div>
       </div>
       <div class="login__group">
          <input class="login__input" type="password" name="input_password" required/>
          <label class="login__label">Password </label>
          <div class="login__bar"></div>
       </div>
       <div class="login__group">
          <input class="login__input" type="Confirm password" name="input_password" required/>
          <label class="login__label">Confirm Password </label>
          <div class="login__bar"></div>
       </div>
       <p class="login__terms">Already have an Account ?<a href="#">LOGIN</a></p>
    </main>
    <footer class="login__footer">
      <input class="login__button" type="button" name="btn_signin" value="Login"/>
    </footer>
 </form>
  );
}

export default Signup;