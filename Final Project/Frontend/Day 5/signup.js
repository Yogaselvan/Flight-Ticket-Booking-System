import { useState } from "react";
import "../Login1/signup.css";
import FormInput from "../Login1/form/form";
import axios from 'axios';

const Signup = () => {
  const submitHandler = (event) => {
    event.preventDefault();
    
    const formData = new FormData(event.target);
    const userid = formData.get('userid');
    const userName = formData.get('userName');
    const email = formData.get('email');
    const birthday = formData.get('birthday');
    const password = formData.get('password');
    const confirmPassword = formData.get('confirmPassword');
    
    const data = { userid, userName, email, password,birthday,confirmPassword };
    console.log(data);
  
    axios.post("http://localhost:8080/", data)
      .then((response) => {
        console.log(response);
      })
      .catch((error) => {
        console.log(error);
      });
  };
  const [values, setValues] = useState({
    username: "",
    email: "",
    birthday: "",
    password: "",
    confirmPassword: "",
  });
  const inputs = [
    {
      id: 1,
      name: "username",
      type: "text",
      placeholder: "Username",
      errorMessage:
        "Username should be 3-16 characters and shouldn't include any special character!",
      label: "Username",
      pattern: "^[A-Za-z0-9]{3,16}$",
      name : "userName",
      required: true,
    },
    {
        id: 2,
        name: "email",
        type: "email",
        placeholder: "Email",
        errorMessage: "Enter a valid email address!",
        label: "Email",
        name : "email",
        required: true,
      },
      {
        id: 3,
        name: "birthday",
        type: "date",
        // placeholder: "Birthday",

        label: "Birthday",
        name : "birthday",
      },
      {
        id: 4,
        name: "password",
        type: "password",
        placeholder: "Password",
        errorMessage:
          "Password should be 8-20 characters and include at least 1 letter, 1 number and 1 special character!",
        label: "Password",
        pattern: `^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{8,20}$`,
        name : "password",
        required: true,
      },
      {
        id: 5,
        name: "confirmPassword",
        type: "password",
        placeholder: "Confirm Password",
        errorMessage: "Passwords don't match!",
        name : "confirmPassword",
        label: "Confirm Password",
        pattern: values.password,
        required: true,
      },
    ];
    const handleSubmit = (e) => {
      e.preventDefault();
    };
    const onChange = (e) => {
        setValues({ ...values, [e.target.name]: e.target.value });
      };
      return (
        
        <div className="yoga8">
          <form  className="Vino8" onSubmit={submitHandler} style={{width:365,paddingLeft:32,borderRadius:15 } } >
            <h3 className="suhass8">SIGNUP</h3>
            {inputs.map((input) => (
              <FormInput
                key={input.id}
                {...input}
                value={values[input.name]}
                onChange={onChange}
              />
            ))}
            <button className="vis5">Submit</button>
          </form>
        </div>
      );
    };
    
    export default Signup;
