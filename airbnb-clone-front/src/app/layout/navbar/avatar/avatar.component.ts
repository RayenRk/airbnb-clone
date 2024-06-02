import { Component, InputSignal, input } from '@angular/core';
import { NgClass } from '@angular/common';
import { FaIconComponent, FaIconLibrary, FontAwesomeModule } from '@fortawesome/angular-fontawesome';

@Component({
  selector: 'app-avatar',
  standalone: true,
  imports: [NgClass, FontAwesomeModule, FaIconComponent],
  templateUrl: './avatar.component.html',
  styleUrl: './avatar.component.scss'
})
export class AvatarComponent {

  imageUrl = input<string>();
  avatarSize = input<"avatar-sm" | "avatar-xl">();

}
